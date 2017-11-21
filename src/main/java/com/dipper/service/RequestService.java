/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.service;

import com.dipper.database.DatabaseClass;
import com.dipper.model.Connection;
import com.dipper.model.RequestResponse;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aman
 */
public class RequestService {
    
    private Map<Connection, Thread> connections = DatabaseClass.getConnections();
    
    public RequestResponse addConnection(Long connId, Long timeOut) {
        
        Connection temp = new Connection(connId, timeOut);
        connections.put(temp, Thread.currentThread());
        try {
            
            Thread.sleep(timeOut*1000);
               
        } catch (InterruptedException ex) {
           
           connections.remove(temp);
           return new RequestResponse("killed");
            
        }
        connections.remove(temp);
        return new RequestResponse("ok");
    }
}
