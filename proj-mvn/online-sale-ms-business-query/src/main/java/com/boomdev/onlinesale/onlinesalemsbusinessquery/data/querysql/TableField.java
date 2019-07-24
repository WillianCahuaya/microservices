package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.querysql;

public interface TableField {

    String CLIENT = "tbl_client cl ";
    String COMPANY = "tbl_company co ";
    String PRODUCT = "tbl_product pr ";
    String CLIENT_PRODUCT = "tbl_client_product clpr ";

    interface Client{
        String PRE = "cl.";
        String CLIENTID = "clientid";
        String COMPANYID = "companyid";
        String FULLNAME = "fullname";
        String PRE_CLIENTID = PRE + CLIENTID + " ";
        String PRE_COMPANYID = PRE + COMPANYID + " ";
        String PRE_FULLNAME = PRE + FULLNAME + " ";
        String AS_CLIENT = "Client";
        String AS_COMPANY = "Company";
        String AS_FULLNAME = "FullName";
        String COL_CLIENTID = PRE_CLIENTID + "as " + AS_CLIENT + " ";
        String COL_COMPANYID = PRE_COMPANYID + "as " + AS_COMPANY + " ";
        String COL_FULLNAME = PRE_FULLNAME + "as " + AS_FULLNAME + " ";
    }

    interface Company{
        String PRE = "co.";
        String COMPANYID = "companyid";
        String COMMERCIALREASON = "commercialreason";
        String PRE_COMPANYID = PRE + COMPANYID + " ";
        String PRE_COMMERCIALREASON = PRE + COMMERCIALREASON+ " ";
        String AS_COMPANY = PRE_COMPANYID + "Company";
        String AS_COMMERCIALREASON = PRE_COMMERCIALREASON + "CommercialReason";
        String COL_COMPANYID = PRE_COMPANYID + "as " + AS_COMPANY + " ";
        String COL_COMMERCIALREASON = PRE_COMMERCIALREASON + "as " + AS_COMMERCIALREASON + " ";
    }

    interface Product{
        String PRE = "pr.";
        String PRODUCTID = "productid";
        String DESCRIPTION = "description";
        String PRICE = "price";
        String PRE_PRODUCTID = PRE + PRODUCTID + " ";
        String PRE_DESCRIPTION = PRE + DESCRIPTION + " ";
        String PRE_PRICE = PRE + PRICE + " ";
        String AS_PRODUCT = "Product";
        String AS_DESCRIPTION = "Description";
        String AS_PRICE = "Price";
        String COL_PRODUCTID = PRE_PRODUCTID + "as " + AS_PRODUCT + " ";
        String COL_DESCRIPTION = PRE_DESCRIPTION + "as " + AS_DESCRIPTION + " ";
        String COL_PRICE = PRE_PRICE + "as " + AS_PRICE + " ";
    }

    interface ClientProduct{
        String PRE = "clpr.";
        String CLIENTPRODUCTID = "clientproductid";
        String CLIENTID = "clientid";
        String PRODUCTID = "productid";
        String AMOUNT = "amount";
        String STATUS = "status";
        String PRE_CLIENTPRODUCTID = PRE + CLIENTPRODUCTID + " ";
        String PRE_CLIENTID = PRE + CLIENTID + " ";
        String PRE_PRODUCTID = PRE + PRODUCTID + " ";
        String PRE_AMOUNT = PRE + AMOUNT + " ";
        String PRE_STATUS = PRE + STATUS + " ";
        String AS_CLIENTPRODUCT = "Receipt";
        String AS_CLIENT = "Client";
        String AS_PRODUCT = "Product";
        String AS_AMOUNT = "Debt";
        String AS_STATUS = "Status";
        String COL_CLIENTPRODUCTID = PRE_CLIENTPRODUCTID + "as " + AS_CLIENTPRODUCT + " ";
        String COL_CLIENTID = PRE_CLIENTID + "as " + AS_CLIENT + " ";
        String COL_PRODUCTID = PRE_PRODUCTID + "as " + AS_PRODUCT + " ";
        String COL_AMOUNT = PRE_AMOUNT + "as " + AS_AMOUNT + " ";
        String COL_STATUS = PRE_STATUS + "as " + AS_STATUS + " ";
    }
}
