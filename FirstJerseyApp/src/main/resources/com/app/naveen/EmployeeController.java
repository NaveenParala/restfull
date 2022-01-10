package com.app.naveen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeController {

	@Path("/hello") 
	@GET
	public String helloEmployee() {
		
		return " Welocome To Employee World";
	}
	
}
