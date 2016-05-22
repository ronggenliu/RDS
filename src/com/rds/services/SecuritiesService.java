package com.rds.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rds.services.entities.Security;

@Path("security")
public class SecuritiesService {

	@GET
	   @Path("/{cusip}")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Security getCusipById(@PathParam("cusip") String cusip)
	   {
	      return new Security(cusip, cusip+"1", cusip+"2", cusip+"3", cusip+"4", cusip+"5", 
	    		  cusip+"6", cusip+"7", cusip+"8", cusip+"9", cusip+"10");
	   }
}
