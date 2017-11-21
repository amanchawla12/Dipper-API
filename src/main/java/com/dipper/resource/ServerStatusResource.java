/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.resource;

import com.dipper.model.ServerStatusResponse;
import com.dipper.service.ServerStatusService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Aman
 */
@Path("/serverStatus")
public class ServerStatusResource {
    
    ServerStatusService serverStatusService = new ServerStatusService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ServerStatusResponse> serverStatus() {
        
        return serverStatusService.serverStatus();
        
    }
    
}
