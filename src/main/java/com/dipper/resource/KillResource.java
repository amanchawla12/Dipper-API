/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.resource;

import com.dipper.model.Connection;
import com.dipper.model.RequestResponse;
import com.dipper.service.KillService;
import javax.ws.rs.Consumes;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Aman
 */
@Path("/kill")
public class KillResource {
    
    KillService killService = new KillService();
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RequestResponse kill(Connection conn) {
        
        return killService.kill(conn);
        
    }
    
}
