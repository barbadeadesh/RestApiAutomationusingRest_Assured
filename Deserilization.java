package com.bridgelabz.RestApi_CQA107;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class deserilization {

	@SuppressWarnings("unchecked")
	@Test

	public void deserilization() throws JsonProcessingException {

		String urlString = "http://localhost:3000/posts";

		BlogPosts1 blogPosts1 = RestAssured.given().get(urlString).as(BlogPosts1.class);
		System.out.println("javaobject:" + blogPosts1);
		String urlString1 = "http://localhost:3000/posts";

		Type type = (Type) new TypeReference<List<BlogPosts1>>() {
		}.getType();

		List<BlogPosts1> blogpostsList = RestAssured.get(urlString1).as(type);

		System.out.println("javaobject1:" + blogpostsList);

	}
}
