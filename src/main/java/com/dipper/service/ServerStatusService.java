/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.service;

import com.dipper.database.DatabaseClass;
import com.dipper.model.Connection;
import com.dipper.model.ServerStatusResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Aman
 */
public class ServerStatusService {
    
    private Map<Connection, Thread> connections = DatabaseClass.getConnections();
    
    public List<ServerStatusResponse> serverStatus() {
        
        ArrayList al = new ArrayList();
        for ( Connection temp : connections.keySet() ) {
            
            al.add( new ServerStatusResponse(temp.getConnId(), temp.getTimeLeft()));
            
        }
        return al;
    }
    
    
}
