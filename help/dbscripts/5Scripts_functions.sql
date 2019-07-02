--manejo de cursores
CREATE OR REPLACE FUNCTION esqmicroservicios.fn_consulta_deudas(in_persona INTEGER,in_empresa INTEGER) RETURNS refcursor AS $$
DECLARE mycurs refcursor;
 BEGIN     
     OPEN mycurs FOR 
	      SELECT 
		   c.codigo as cliente, 
		   c.nombres as nombres,
		   p.codigo as producto, 
		   p.descripcion as descripcion,
		   p.precio as precio,
		   cp.codigo as recibo,
		   cp.monto as deuda,
           cp.estado as estado		   
		   FROM esqmicroservicios.TBL_CLIENTE c 
		   INNER JOIN esqmicroservicios.TBL_CLIENTE_PRODUCTO cp on c.codigo = cp.cliente 
		   INNER JOIN esqmicroservicios.TBL_PRODUCTO p on p.codigo = cp.producto
		   and c.codigo = in_persona and c.empresa = in_empresa;
     RETURN mycurs;
 END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION esqmicroservicios.fn_pagar_deuda(
  in_recibo INTEGER,
  in_producto INTEGER, 
  in_cliente INTEGER
  ) RETURNS VARCHAR(20) AS $$
 DECLARE resultado VARCHAR(20);
 BEGIN
  resultado:='0000';
  	 UPDATE esqmicroservicios.TBL_CLIENTE_PRODUCTO SET estado = '1' WHERE codigo = in_recibo and cliente = in_cliente and producto = in_producto;
	    return resultado;
	EXCEPTION WHEN others then
    return SQLSTATE;
 END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION esqmicroservicios.fn_registrar_deuda(
  in_cliente INTEGER,
  in_producto INTEGER, 
  in_monto INTEGER
  ) RETURNS VARCHAR(20) AS $$
 DECLARE resultado VARCHAR(20);
 BEGIN
  resultado:='0000';
  	 insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(in_cliente,in_producto,in_monto,'0');
	 return resultado;
	EXCEPTION WHEN others then
    return SQLSTATE;
 END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION esqmicroservicios.fn_pagar_revertir(
  in_recibo INTEGER,
  in_producto INTEGER, 
  in_cliente INTEGER
  ) RETURNS VARCHAR(20) AS $$
 DECLARE resultado VARCHAR(20);
 BEGIN
  resultado:='0000';
  	 UPDATE esqmicroservicios.TBL_CLIENTE_PRODUCTO SET estado = '0' WHERE codigo= in_recibo and cliente = in_cliente and producto = in_producto;
	    return resultado;
	EXCEPTION WHEN others then
    return SQLSTATE;
 END;
$$ LANGUAGE plpgsql;