package com.bridgelabz.RestApi_CQA107;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers.*;

public class RestApiTest {

	// POST'S

	@Test
	public void getposts() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, " http://localhost:3000/posts");

		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void createposts() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{" + "        \"id\": 7,\r\n" + "        \"name\": \"msd\",\r\n"
				+ "        \"field\": \"cricket;\"\r\n" + "    }");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, " http://localhost:3000/posts");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
	}

	@Test
	public void updateposts() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{" + "        \"id\": 6,\r\n" + "        \"name\": \"pravin\",\r\n"
				+ "        \"field\": \"farming;\"\r\n" + "    }");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.PUT, " http://localhost:3000/posts/6");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void deleteposts() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.DELETE, " http://localhost:3000/posts/7");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);

	}

	// COMMENT'S

	@Test
	public void getcomments() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, "  http://localhost:3000/comments");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void createcomments() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "        \"id\": 8,\r\n" + "        \"Interest\": \"kabbadi\",\r\n"
				+ "        \"postId\": 5\r\n" + "    }");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, "  http://localhost:3000/comments");

		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);

	}

	@Test
	public void updatecomments() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{\r\n" + "        \"id\": 8,\r\n" + "        \"Interest\": \"chess\",\r\n"
				+ "        \"postId\": 5\r\n" + "    }");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.PUT, "  http://localhost:3000/comments/8");

		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);

	}

	@Test
	public void Deletecomments() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.DELETE, "  http://localhost:3000/comments/5");

		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);

	}

	// USER PROFILE

	@Test
	public void getUserprofile() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.GET, " http://localhost:3000/profile");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void createUserprofile() {

		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.accept(ContentType.JSON);
		requestSpecification.body("{ \"name\": \"VIT\"}");

		requestSpecification.contentType("application/Json");
		Response response = requestSpecification.request(Method.POST, " http://localhost:3000/profile");
		response.prettyPrint();
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
	}
}
