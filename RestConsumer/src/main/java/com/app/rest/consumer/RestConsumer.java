package com.app.rest.consumer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestConsumer {
	public static void main(String[] args) {
		String url="http://localhost:2020/RestFullHello/rest/message/xml";
		//create the empty client object
		Client c=Client.create();
		
		//creating web resource 
		WebResource wr=c.resource(url);
		
		//making request and getting response
		ClientResponse cr=wr.get(ClientResponse.class);
		
		//getting response from the client object
		String str=cr.getEntity(String.class);
		
		//printing the response
		System.out.println(str);
		
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	
	}
}
