package com.app.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageProvider {

	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message() {
		return "Welcome to RestFull WebService";
	}
	@Path("/xml")
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<Html>"+"<title>"+" RestFull WebService "+"</title>"+"<body>"+"<h1>"+" Welcome to Rest "+"</h1> </body>"+"</Html>";
//		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
//        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";

	}
}
