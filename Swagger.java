package com.bridgelabz.RestApi_CQA107;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerApi {

// USER 

	@Test

	public void createuser() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "  \"id\": 1,\r\n" + "  \"username\": \"AB123\",\r\n"
				+ "  \"firstName\": \"Adesh\",\r\n" + "  \"lastName\": \"Barbade\",\r\n"
				+ "  \"email\": \"abc123@gmail.com\",\r\n" + "  \"password\": \"abcfde1234\",\r\n"
				+ "  \"phone\": \"string\",\r\n" + "  \"userStatus\": 0\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, "https://petstore.swagger.io/v2/user");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void createuserwitharray() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("[\r\n" + "  {\r\n" + "    \"id\": 2,\r\n" + "    \"username\": \"pr12\",\r\n"
				+ "    \"firstName\": \"pravin\",\r\n" + "    \"lastName\": \"barbade\",\r\n"
				+ "    \"email\": \"prav1258@gmail.com\",\r\n" + "    \"password\": \"852sbyw\",\r\n"
				+ "    \"phone\": \"8523697425\",\r\n" + "    \"userStatus\": 0\r\n" + "  }\r\n" + "]");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST,
				"https://petstore.swagger.io/v2/user/createWithArray");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void createuserwithList() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("[\r\n" + "  {\r\n" + "    \"id\": 3,\r\n" + "    \"username\": \"Ak123\",\r\n"
				+ "    \"firstName\": \"akshay\",\r\n" + "    \"lastName\": \"palkar\",\r\n"
				+ "    \"email\": \"pal2589@gmail.com\",\r\n" + "    \"password\": \"85697dhey\",\r\n"
				+ "    \"phone\": \"8521478965\",\r\n" + "    \"userStatus\": 0\r\n" + "  }\r\n" + "]");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST,
				"https://petstore.swagger.io/v2/user/createWithList");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void getuserbyname() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://petstore.swagger.io/v2/user/AB123");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void updateuser() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "  \"id\": 1,\r\n" + "  \"username\": \"AB123\",\r\n"
				+ "  \"firstName\": \"ABxax\",\r\n" + "  \"lastName\": \"BCqed\",\r\n"
				+ "  \"email\": \"dndjsb258@gmail.com\",\r\n" + "  \"password\": \"swjkhbA258\",\r\n"
				+ "  \"phone\": \"9988553366\",\r\n" + "  \"userStatus\": 0\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.PUT, "https://petstore.swagger.io/v2/user/AB123");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void deleteuser() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.DELETE, "https://petstore.swagger.io/v2/user/AK123");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void userlogin() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.queryParam("username", "AB123");
		requestSpecification.queryParam("PASSWORD", "abcfde1234");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"https://petstore.swagger.io/v2/user/login?username=AB123&password=abcfde1234");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void logoutuser() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://petstore.swagger.io/v2/user/logout");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	// STORE

	@Test

	public void orderplace() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "  \"id\": 11,\r\n" + "  \"petId\": 8,\r\n" + "  \"quantity\": 12,\r\n"
				+ "  \"shipDate\": \"2022-07-28T04:05:29.026Z\",\r\n" + "  \"status\": \"placed\",\r\n"
				+ "  \"complete\": true\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, "https://petstore.swagger.io/v2/store/order");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void findpurchaseorderbyid() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://petstore.swagger.io/v2/store/order/10");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void deletepurchaseorderbyid() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.DELETE,
				"https://petstore.swagger.io/v2/store/order/11");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void petinventories() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "https://petstore.swagger.io/v2/store/inventory");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	// PET

	@Test

	public void createnewpet() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, "https://petstore.swagger.io/v2/pet\r\n" + "");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void getpetsbyid() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET,
				"https://petstore.swagger.io/v2/pet/9223372036854034403\r\n" + "" + "" + "");

		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test

	public void updatepetbyid() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "  \"id\": 0,\r\n" + "  \"category\": {\r\n" + "    \"id\": 4,\r\n"
				+ "    \"name\": \"JONTYYYYYYYY\"\r\n" + "  },\r\n" + "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n" + "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n"
				+ "      \"id\": 0,\r\n" + "      \"name\": \"string\"\r\n" + "    }\r\n" + "  ],\r\n"
				+ "  \"status\": \"available\"\r\n" + "}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.PUT,
				"https://petstore.swagger.io/v2/pet/9223372036854034403\\r\\n" + "" + "");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);

	}

}
