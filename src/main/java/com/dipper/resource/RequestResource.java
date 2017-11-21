/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.resource;

import com.dipper.model.RequestResponse;
import com.dipper.service.RequestService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Aman
 */

@Path("/request")
public class RequestResource {
    
    RequestService requestService = new RequestService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RequestResponse addConnection(@QueryParam("connId") Long connId, 
                                         @QueryParam("timeOut") Long timeOut) {
        
        
        return requestService.addConnection(connId, timeOut);
        
    }
    
}


