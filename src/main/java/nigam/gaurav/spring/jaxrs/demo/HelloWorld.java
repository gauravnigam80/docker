package nigam.gaurav.spring.jaxrs.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/demo")
public class HelloWorld {
	
	@GET
	@Path("/hello")
	public String sayHello(){
		
		return "Hello World";
	}

}
