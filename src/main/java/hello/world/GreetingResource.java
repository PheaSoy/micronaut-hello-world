package hello.world;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Produces;

@Controller
public class GreetingResource {

    @Get("/greeting")
    @Produces(MediaType.APPLICATION_JSON)
    String greet(){
        return "Hello World!";
    }
}
