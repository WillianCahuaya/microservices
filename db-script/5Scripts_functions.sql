--manejo de cursores
CREATE OR REPLACE FUNCTION schmicroservices.fn_query_debt(in_clientid INTEGER, in_companyid INTEGER) RETURNS refcursor AS $$
	DECLARE mycurs refcursor;
	BEGIN     
		OPEN mycurs FOR 
			SELECT 
				c.clientid as client, 
				c.fullname as fullname,
				p.productid as product, 
				p.description as description,
				p.price as price,
				cp.clientproductid as receipt,
				cp.amount as debt,
				cp.status as status		   
			FROM schmicroservices.TBL_client c 
			INNER JOIN schmicroservices.TBL_CLIENT_PRODUCT cp ON c.clientid = cp.clientid 
			INNER JOIN schmicroservices.TBL_PRODUCT p ON p.productid = cp.productid
			AND c.clientid = in_clientid 
			AND c.companyid = in_companyid;
		RETURN mycurs;
	END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION schmicroservices.fn_pay_debt(in_receipt INTEGER, in_productid INTEGER, in_clientid INTEGER) RETURNS VARCHAR(20) AS $$
	DECLARE response VARCHAR(20);
	BEGIN
		response:='0000';
		UPDATE schmicroservices.TBL_CLIENT_PRODUCT 
			SET status = '1' 
		WHERE clientproductid = in_receipt 
		AND clientid = in_clientid 
		AND productid = in_productid;
	    RETURN response;
	EXCEPTION WHEN others then
		RETURN SQLSTATE;
	END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION schmicroservices.fn_register_debt(in_clientid INTEGER, in_productid INTEGER, in_amount NUMERIC (5, 2)) RETURNS VARCHAR(20) AS $$
	DECLARE response VARCHAR(20);
	BEGIN
		response:='0000';
		INSERT INTO schmicroservices.TBL_CLIENT_PRODUCT(clientid, productid, amount, status) 
			VALUES(in_clientid, in_productid, in_amount, '0');
		RETURN response;
	EXCEPTION WHEN others then
		RETURN SQLSTATE;
	END;
$$ LANGUAGE plpgsql;


CREATE OR REPLACE FUNCTION schmicroservices.fn_revert_pay(in_receipt INTEGER, in_productid INTEGER,  in_clientid INTEGER) RETURNS VARCHAR(20) AS $$
	DECLARE response VARCHAR(20);
	BEGIN
		response:='0000';
		UPDATE schmicroservices.TBL_CLIENT_PRODUCT 
			SET status = '0' 
		WHERE clientproductid = in_receipt 
		AND clientid = in_clientid 
		AND productid = in_productid;
	    RETURN response;
	EXCEPTION WHEN others then
		RETURN SQLSTATE;
	END;
$$ LANGUAGE plpgsql;