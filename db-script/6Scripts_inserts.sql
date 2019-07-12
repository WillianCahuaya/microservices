--insertando companyids
insert INTO schmicroservices.TBL_COMPANY(commercialreason) VALUES ('TELEFONIA');
insert INTO schmicroservices.TBL_COMPANY(commercialreason) VALUES ('SERVICIOS DE AGUA');
insert INTO schmicroservices.TBL_COMPANY(commercialreason) VALUES ('SERVICIOS DE LUZ');

--insertando clientids
insert INTO schmicroservices.TBL_CLIENT(companyid, fullname) VALUES (1,'Jose Diaz');
insert INTO schmicroservices.TBL_CLIENT(companyid, fullname) VALUES (1,'Miguel Cardenas');
insert INTO schmicroservices.TBL_CLIENT(companyid, fullname) VALUES (1,'Andres Bellido');
insert INTO schmicroservices.TBL_CLIENT(companyid, fullname) VALUES (1,'Willy Espinoza');
insert INTO schmicroservices.TBL_CLIENT(companyid, fullname) VALUES (1,'Pedro Gallese');

--insertando  productids 
insert INTO schmicroservices.TBL_PRODUCT(description, price) VALUES('AGUA',100);
insert INTO schmicroservices.TBL_PRODUCT(description, price) VALUES('TELEFONO',200);
insert INTO schmicroservices.TBL_PRODUCT(description, price) VALUES('LUZ',300);
insert INTO schmicroservices.TBL_PRODUCT(description, price) VALUES('EDUCACION',300);

insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,100,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,200,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,200,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,300,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,300,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,400,'0');
insert INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) VALUES(1,1,400,'0');