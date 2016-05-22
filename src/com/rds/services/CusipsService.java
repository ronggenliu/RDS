package com.rds.services;
 
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.rds.services.entities.Cusip;
 
@Path("cusips")
public class CusipsService
{
  
   @GET
   @Path("/{id}")
   @Produces(MediaType.APPLICATION_JSON)
   public List<Cusip> getCusipById(@PathParam("id") Integer id)
   {
      List<Cusip> cusips = new ArrayList<Cusip>();
      cusips.add(new Cusip(id, "CUSIP" + id));
      cusips.add(new Cusip(id+1, "CUSIP1" + id));
      return cusips;
   }
}