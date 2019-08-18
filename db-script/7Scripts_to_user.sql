DROP TABLE IF EXISTS schmicroservices.TBL_USER;
DROP SEQUENCE IF EXISTS schmicroservices."SEQ_TBL_USER";

CREATE SEQUENCE schmicroservices."SEQ_TBL_USER"
   INCREMENT 1
   START 1
   MINVALUE 1
   MAXVALUE 99999
   CACHE 1;
ALTER SEQUENCE schmicroservices."SEQ_TBL_USER" OWNER TO postgres;

CREATE TABLE schmicroservices.TBL_USER(
  userid INTEGER NOT NULL,
  username VARCHAR(10) NOT NULL,
  password VARCHAR(10) NULL
)TABLESPACE ts_data_microservices;
ALTER TABLE IF EXISTS schmicroservices.TBL_USER ADD CONSTRAINT XPKTBL_USER PRIMARY KEY(userid);
ALTER TABLE IF EXISTS schmicroservices.TBL_USER ALTER COLUMN userid SET DEFAULT nextval('schmicroservices."SEQ_TBL_USER"');

INSERT INTO schmicroservices.TBL_USER (username, password) VALUES('admin','admin');