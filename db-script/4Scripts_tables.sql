DROP TABLE IF EXISTS esqmicroservices.TBL_CLIENT_PRODUCT;
DROP TABLE IF EXISTS esqmicroservices.TBL_PRODUCT;
DROP TABLE IF EXISTS esqmicroservices.TBL_CLIENT;
DROP TABLE IF EXISTS esqmicroservices.TBL_COMPANY;


CREATE TABLE esqmicroservices.TBL_COMPANY(
  companyid INTEGER NOT NULL,
  commercialreason VARCHAR(200) NULL
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservices.TBL_COMPANY ADD CONSTRAINT XPKTBL_COMPANY PRIMARY KEY(companyid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_COMPANY ALTER COLUMN companyid SET DEFAULT nextval('esqmicroservices."SEQ_TBL_COMPANY"');

CREATE TABLE esqmicroservices.TBL_CLIENT(
  clientid INTEGER NOT NULL,
  companyid INTEGER NOT NULL,
  fullname VARCHAR(200) NULL
)TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT ADD CONSTRAINT XPKTBL_CLIENT PRIMARY KEY(clientid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT ADD CONSTRAINT R1 FOREIGN KEY(companyid) REFERENCES esqmicroservices.TBL_COMPANY(companyid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT ALTER COLUMN clientid SET DEFAULT nextval('esqmicroservices."SEQ_TBL_CLIENT"');


CREATE TABLE esqmicroservices.TBL_PRODUCT(
   productid INTEGER NOT NULL,
   description VARCHAR(200) NULL,
   price NUMERIC (5, 2) NULL   
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservices.TBL_PRODUCT ADD CONSTRAINT XPKTBL_PRODUCT PRIMARY KEY(productid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_PRODUCT ALTER COLUMN productid SET DEFAULT nextval('esqmicroservices."SEQ_TBL_PRODUCT"');

CREATE TABLE esqmicroservices.TBL_CLIENT_PRODUCT(
   clientproductid INTEGER NOT NULL,
   clientid INTEGER NOT NULL,
   productid INTEGER NOT NULL,
   amount NUMERIC (5, 2) NOT NULL,
   status VARCHAR(1) NULL
) TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT_PRODUCT ADD CONSTRAINT XPKTBL_CLIENT_PRODUCT PRIMARY KEY(clientproductid,clientid,productid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT_PRODUCT ADD CONSTRAINT R2 FOREIGN KEY(clientid) REFERENCES esqmicroservices.TBL_CLIENT(clientid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT_PRODUCT ADD CONSTRAINT R3 FOREIGN KEY(productid) REFERENCES esqmicroservices.TBL_PRODUCT(productid);
ALTER TABLE IF EXISTS esqmicroservices.TBL_CLIENT_PRODUCT ALTER COLUMN clientproductid SET DEFAULT nextval('esqmicroservices."SEQ_TBL_CLIENT_PRODUCT"');
