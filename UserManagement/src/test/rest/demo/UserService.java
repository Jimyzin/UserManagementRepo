package test.rest.demo;
import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userService")
public class UserService {

@GET
@Path("/userList")
@Produces(MediaType.APPLICATION_XML)
public List<User> getAll()
{
	List<User> userList = new ArrayList<User>();
	User user1 = new User(1,"Jimy","Painter");
	User user2 = new User(2,"Sima","Mother");
    userList.add(user1);
    userList.add(user2);
	
    return userList;
}
}
