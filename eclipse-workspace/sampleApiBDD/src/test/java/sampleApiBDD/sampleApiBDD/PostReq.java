package sampleApiBDD.sampleApiBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostReq {

	@Test
	public void postRequest() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "sampleuser@reqres.in"); 
		requestParams.put("first_name", "sample");
		requestParams.put("last_name", "user");
		requestParams.put("avatar", "https://reqres.in/img/faces/1-image.jpg");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.post(""); 
		int statusCode = response.getStatusCode();
		System.out.println("Response body: " + response.body().asString());
		Assert.assertEquals(statusCode, 201);
	}
	
	@Test
	public void retrieveNewId() {
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "megshark@reqres.in"); 
		requestParams.put("first_name", "meg");
		requestParams.put("last_name", "shark");
		requestParams.put("avatar", "https://reqres.in/img/faces/4-image.jpg");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.post(""); 
		JsonPath jsonpath=response.jsonPath();
		System.out.println("An user is sucessfully created with id: "+jsonpath.get("id"));     
	}
	
	@Test
	public void validateUser() {
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "rajrani@reqres.in"); 
		requestParams.put("first_name", "raj");
		requestParams.put("last_name", "rani");
		requestParams.put("avatar", "https://reqres.in/img/faces/8-image.jpg");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.post("");
		JsonPath jsonpath=response.jsonPath();
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(jsonpath.getString("first_name"), "raj");
		Assert.assertEquals(jsonpath.getString("last_name"), "rani");
	} 
}
