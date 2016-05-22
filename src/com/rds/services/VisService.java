package com.rds.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rds.services.entities.Vis;

@Path("vis")
public class VisService {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vis> getCusipById(@PathParam("id") String id) {
		List<Vis> viss = new ArrayList<Vis>();
		viss.add(new Vis(id, id + "1", id + "2", id + "3", id + "4", id + "5", id + "6"));
		viss.add(new Vis(id + 1, id + "21", id + "22", id + "23", id + "24", id + "25", id + "26"));
		return viss;
	}
}
