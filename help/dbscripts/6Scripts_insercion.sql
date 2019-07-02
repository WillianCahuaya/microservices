--insertando empresas
	insert INTO esqmicroservicios.TBL_EMPRESA(razonsocial) VALUES ('TELEFONIA');
	insert INTO esqmicroservicios.TBL_EMPRESA(razonsocial) VALUES ('SERVICIOS DE AGUA');
	insert INTO esqmicroservicios.TBL_EMPRESA(razonsocial) VALUES ('SERVICIOS DE LUZ');

--insertando clientes
insert INTO esqmicroservicios.TBL_CLIENTE(empresa,nombres) VALUES (1,'Jose Diaz');
insert INTO esqmicroservicios.TBL_CLIENTE(empresa,nombres) VALUES (1,'Miguel Cardenas');
insert INTO esqmicroservicios.TBL_CLIENTE(empresa,nombres) VALUES (1,'Andres Bellido');
insert INTO esqmicroservicios.TBL_CLIENTE(empresa,nombres) VALUES (1,'Willy Espinoza');
insert INTO esqmicroservicios.TBL_CLIENTE(empresa,nombres) VALUES (1,'Pedro Gallese');

--insertando productos 

insert INTO esqmicroservicios.TBL_PRODUCTO(descripcion,precio) VALUES('AGUA',100);
insert INTO esqmicroservicios.TBL_PRODUCTO(descripcion,precio) VALUES('TELEFONO',200);
insert INTO esqmicroservicios.TBL_PRODUCTO(descripcion,precio) VALUES('LUZ',300);
insert INTO esqmicroservicios.TBL_PRODUCTO(descripcion,precio) VALUES('EDUCACION',300);

insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,100,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,200,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,200,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,300,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,300,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,400,'0');
insert INTO esqmicroservicios.TBL_CLIENTE_PRODUCTO(cliente,producto,monto,estado) VALUES(1,1,400,'0');
