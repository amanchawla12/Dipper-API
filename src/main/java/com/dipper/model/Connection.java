/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aman
 */
public class Connection {
    
    private Long connId;
    private Long timeOut;
    private Long timeCreated;
    
    public Connection() {
        
    }
    
    public Connection(Long connId, Long timeOut) {
        
        this.connId = connId;
        this.timeOut = timeOut;
        this.timeCreated = (System.currentTimeMillis() + (timeOut * 1000));
    }

    public Long getConnId() {
        return connId;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public Long getTimeCreated() {
        return timeCreated;
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public void setTimeCreated(Long timeCreated) {
        this.timeCreated = timeCreated;
    }
    
    public Double getTimeLeft() {
        
        Long currTime = System.currentTimeMillis();
        
        Double ans = (timeOut.doubleValue() - (currTime - timeCreated))/1000;
        return ans;
        
    }
    
    
    
}
