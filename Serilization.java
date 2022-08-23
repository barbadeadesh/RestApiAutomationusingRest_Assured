package com.bridgelabz.RestApi_CQA107;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.path.json.exception.JsonPathException;
import io.restassured.response.Response;

public class serilization {
	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Test
	public void Seriliza() throws JsonProcessingException {

		BlogPosts1 blogPosts1 = new BlogPosts1();
		blogPosts1.setId(2);
		blogPosts1.setName("Tejas");
		blogPosts1.setField("computer");

		String urlString = "http://localhost:3000/posts";

		String jsonString = MAPPER.writeValueAsString(blogPosts1);

		Response response = RestAssured.given().contentType(ContentType.JSON).body(jsonString).log().all()
				.post(urlString);
		response.prettyPrint();
		response.statusCode();
	}
}