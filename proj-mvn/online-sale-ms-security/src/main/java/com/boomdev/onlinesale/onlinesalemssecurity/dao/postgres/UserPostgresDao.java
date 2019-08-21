package com.boomdev.onlinesale.onlinesalemssecurity.dao.postgres;

import com.boomdev.onlinesale.onlinesalebeanbusiness.entity.security.User;
import com.boomdev.onlinesale.onlinesalemssecurity.dao.UserDao;
import com.boomdev.onlinesale.onlinesalemssecurity.data.connection.ConnectionDB;
import com.boomdev.onlinesale.onlinesalemssecurity.exception.AppException;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository
public class UserPostgresDao implements UserDao {

    @Override
    public User getUser(String username) {

        ConnectionDB connDB = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = new User();

        try {
            connDB.getConexion().setAutoCommit(false);
            String SQL = "SELECT username, password FROM schmicroservices.TBL_USER WHERE username=? ORDER BY id";

            pstmt = connDB.getConexion().prepareStatement(SQL);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            connDB.getConexion().commit();
            while (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            throw new AppException(e.getMessage());
        } finally {
            try {
                connDB.closeResources(connDB.getConexion(), rs, null, null, pstmt);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return user;
        }
    }
}
