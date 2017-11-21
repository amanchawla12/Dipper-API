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
import java.util.Objects;

/**
 *
 * @author Aman
 */
public class KillService {
    
    private Map<Connection, Thread> connections = DatabaseClass.getConnections();
    
    public RequestResponse kill(Connection conn) {
        
        Connection toBeKilled = null;
        for(Connection temp : connections.keySet()) {
            
            if(Objects.equals(temp.getConnId(), conn.getConnId())) {
                
                toBeKilled = temp;
                break;
            }
            
        }
        if(toBeKilled != null) {
            
            Thread t = connections.get(toBeKilled);
            t.interrupt();
            RequestResponse res = new RequestResponse("ok");
            return res;
            
        } else {
            
            RequestResponse res = new RequestResponse("Invalid Connection Id : " 
                                                        + conn.getConnId());
            
            return res;
            
        }
        
    }
    
}
