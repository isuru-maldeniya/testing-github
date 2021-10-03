package com.example.traning1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tank")
public class Tank {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Thank";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
