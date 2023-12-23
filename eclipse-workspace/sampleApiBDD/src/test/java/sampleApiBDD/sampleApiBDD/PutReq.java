package sampleApiBDD.sampleApiBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutReq {
	int id;
	
	//Creating a new user for ID and updating the same
	@Test
	public void createNewUser() {
		RestAssured.baseURI="https://reqres.in/api/users";
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
		id=jsonpath.getInt("id");
	}
	
	@Test
	public void updateUser() {
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "nithintej@reqres.in"); 
		requestParams.put("first_name", "nithin");
		requestParams.put("last_name", "tej");
		requestParams.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.put("/id");
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void validateUpdatedUser() {
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", "nithintej@reqres.in"); 
		requestParams.put("first_name", "rajeev");
		requestParams.put("last_name", "kumar");
		requestParams.put("avatar", "https://reqres.in/img/faces/12-image.jpg");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.put("/id");
		JsonPath jsonpath=response.jsonPath();
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(jsonpath.getString("first_name"), "rajeev");
		Assert.assertEquals(jsonpath.getString("last_name"), "kumar");
	}
}
