DROP TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO;
DROP TABLE IF EXISTS esqmicroservicios.TBL_PRODUCTO;
DROP TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE;
DROP TABLE IF EXISTS esqmicroservicios.TBL_EMPRESA;


CREATE TABLE esqmicroservicios.TBL_EMPRESA(
  codigo INTEGER NOT NULL,
  razonsocial VARCHAR(200) NULL
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservicios.TBL_EMPRESA ADD CONSTRAINT XPKTBL_EMPRESA PRIMARY KEY(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_EMPRESA ALTER COLUMN codigo SET DEFAULT nextval('esqmicroservicios."SEQ_TBL_EMPRESA"');

CREATE TABLE esqmicroservicios.TBL_CLIENTE(
  codigo INTEGER NOT NULL,
  empresa INTEGER NOT NULL,
  nombres VARCHAR(200) NULL
)TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE ADD CONSTRAINT XPKTBL_CLIENTE PRIMARY KEY(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE ADD CONSTRAINT R1 FOREIGN KEY(empresa) REFERENCES esqmicroservicios.TBL_EMPRESA(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE ALTER COLUMN codigo SET DEFAULT nextval('esqmicroservicios."SEQ_TBL_CLIENTE"');


CREATE TABLE esqmicroservicios.TBL_PRODUCTO(
   codigo INTEGER NOT NULL,
   descripcion VARCHAR(200) NULL,
   precio INTEGER NULL   
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservicios.TBL_PRODUCTO ADD CONSTRAINT XPKTBL_PRODUCTO PRIMARY KEY(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_PRODUCTO ALTER COLUMN codigo SET DEFAULT nextval('esqmicroservicios."SEQ_TBL_PRODUCTO"');

CREATE TABLE esqmicroservicios.TBL_CLIENTE_PRODUCTO(
   codigo INTEGER NOT NULL,
   cliente INTEGER NOT NULL,
   producto INTEGER NOT NULL,
   monto INTEGER NOT NULL,
   estado VARCHAR(1) NULL
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO ADD CONSTRAINT XPKTBL_CLIENTE_PRODUCTO PRIMARY KEY(codigo,cliente,producto);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO ADD CONSTRAINT R2 FOREIGN KEY(cliente) REFERENCES esqmicroservicios.TBL_CLIENTE(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO ADD CONSTRAINT R3 FOREIGN KEY(producto) REFERENCES esqmicroservicios.TBL_PRODUCTO(codigo);
ALTER TABLE IF EXISTS esqmicroservicios.TBL_CLIENTE_PRODUCTO ALTER COLUMN codigo SET DEFAULT nextval('esqmicroservicios."SEQ_TBL_CLIENTE_PRODUCTO"');

