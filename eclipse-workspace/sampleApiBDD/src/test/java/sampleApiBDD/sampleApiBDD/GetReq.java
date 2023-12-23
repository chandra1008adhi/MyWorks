package sampleApiBDD.sampleApiBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Scanner;



public class GetReq {
	
	
	@Test
	public void validateResponseCode() {
		RequestSpecification httpRequest = RestAssured.given();
		//Response response = httpRequest.request(Method.GET, "");
		Response response = httpRequest.get("");
		System.out.println("RESPONSE");
		System.out.println(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(),200); //Response Code Validation
	}
	
	@Test
	public void getFirstNameAndEmail() {
		RestAssured.baseURI="https://reqres.in/api/users?page=1";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "");
		JsonPath jsonpath=response.jsonPath();
		int size=jsonpath.get("per_page");
		System.out.println("************All First Names***********");
		for(int i=0;i<size;i++)
		{
			System.out.print(jsonpath.get("data["+i+"].id").toString()+"---->");
			System.out.print(jsonpath.get("data["+i+"].first_name").toString()+"--->");
			System.out.println(jsonpath.get("data["+i+"].email").toString());
		}
		
	}
	//Generic method for reading ID
	public static int readId() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any id  ");
		int id;
		id=sc.nextInt();
		sc.close();
		return id;
	}
	@Test
	public void userDetailsPerId()
	{
		int id=readId();
		RestAssured.baseURI="https://reqres.in/api/users?page=1";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "");
		JsonPath jsonpath=response.jsonPath();
		System.out.println("Details of the user with id:"+id);
		System.out.println(jsonpath.get("data["+(id-1)+"]").toString());
	}

}
