package org.util.com;



public class Constants {
	
	private Constants() {
		
	}

	public static final String EXCELPATH = System.getProperty("user.dir")+"/src/test/resources/DataFolder/CTOS_Data_Passing.xlsx";
	public static final String TESTDATASHEETNAME = "TestData";
	public static final String EXTENTREPORTPATH = System.getProperty("user.dir")+"\\target\\APIreports\\API_Report\\"+".html";
	
	
	public static final String RESPONSETXTPATH="./output/responses/";
	
	public static final String RUNMANAGERSHEET= "RUNMANAGER";
	public static final String JSONSLOCATION=System.getProperty("user.dir")+"/src/test/resources/jsons";
	public static final String BASEURL = "";
	public static final String BASEURL_BESTBUY = "";
	public static final String USERNAME ="";
	public static final String CLIENT_SECRET="";
	public static final String GRANT_TYPE= "";
	public static final String CLIENT_ID= "";
	public static final String PASSWORD= "";
	public static final String FSI_LANGUAGE="";

	//Endpoints
	public static final String COUNTRYDETAILSBYNAME_ENDPOINT = "/rest/v2/name/{name}";
	public static final String BESTBUY_GETPRODUCTS_ENDPOINT = "/products?$limit={limit}";
	public static final String BESTBUY_POSTPRODUCT_ENDPOINT ="/products";
	public static final String AUTH_ENDPOINT = "";
	
	//Request xml paths
	public static final String REQUEST_JSON_FOLDER_PATH =  System.getProperty("user.dir")+
			"/src/test/resources/jsonsforrequestbody/";


}
