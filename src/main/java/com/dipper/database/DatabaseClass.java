/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.database;

import com.dipper.model.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aman
 */
public class DatabaseClass {
    
    private static Map<Connection, Thread> connections = new HashMap<>();

    public static Map<Connection, Thread> getConnections() {
        return connections;
    }

    public static void setConnections(Map<Connection, Thread> connections) {
        DatabaseClass.connections = connections;
    }

}
