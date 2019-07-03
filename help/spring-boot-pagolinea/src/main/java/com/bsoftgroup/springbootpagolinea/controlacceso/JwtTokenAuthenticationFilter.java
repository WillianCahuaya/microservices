package com.bsoftgroup.springbootpagolinea.controlacceso;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtTokenAuthenticationFilter extends OncePerRequestFilter {

	
	private final JwtConfig jwtConfig;
	
	public JwtTokenAuthenticationFilter(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig; 
		
	}
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//1 obtener header
		String header = request.getHeader(jwtConfig.getHeader());
		try {
		//2 validar prefijo
		if(header == null || !header.startsWith(jwtConfig.getPrefix()) ) {
			
			filterChain.doFilter(request, response);
			return;
			
		}
				
		//3 obtener token
		String token = header.replace(jwtConfig.getPrefix(), "");
		//4 validar token
		
        Claims claims = Jwts.parser()
							.setSigningKey(jwtConfig.getSecret().getBytes())
							.parseClaimsJws(token)
							.getBody();
			//5 create auth object
			String username = claims.getSubject();
			if(username !=null) {
				@SuppressWarnings("unchecked")
				List<String> authorities = (List<String>) claims.get("authorities");
				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
						username, null, authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
				
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
			
			//
		}catch(Exception e) {
			SecurityContextHolder.clearContext();
		
		}
		
	filterChain.doFilter(request, response);
	}
}
