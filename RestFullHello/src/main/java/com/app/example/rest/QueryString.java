package com.app.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("queryparam")
public class QueryString {

	@Path("/abc")
	@GET
	public String messageSending(@QueryParam("eid")int empId,
			@QueryParam("ename") String empName,@QueryParam("esal") double empSal) {
				return "Hello "+empId+","+empName+","+empSal;
		
	}
}
