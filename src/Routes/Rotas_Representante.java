package Routes;

import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Models.Representante;

@Path("/Representante")

public class Rotas_Representante {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{id}")
  
  public Representante get_representantes(@PathParam("id") int id){
	  return null;
  }
}
