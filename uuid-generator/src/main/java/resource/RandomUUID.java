package resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.UUID;

//import java.util.Optional;

@Path("getRandomUUID")
public class RandomUUID {


    @GET
    public String getUUID() {
        return UUID.randomUUID().toString()+"\n";
    }
}
