package kihonya.net.demo.rest;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    public String message() {
        return "Hello Open Liberty JAX-RS Application";
    }
}
