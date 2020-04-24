package calcul;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/calcul")
public class Prix {
    private int prixKM = 10;

    @GET
    @Path("{dist}")
    @Produces("text/plain")
    public String getPrix(@PathParam("dist") int a){
        return String.valueOf(a*this.prixKM);
    }
}
