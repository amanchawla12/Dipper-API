/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipper.model;

/**
 *
 * @author Aman
 */
public class ServerStatusResponse {
    
    private Long connId;
    private Double timeLeft;

    public Long getConnId() {
        return connId;
    }

    public Double getTimeLeft() {
        return timeLeft;
    }

    public ServerStatusResponse(Long connId, Double timeLeft) {
        this.connId = connId;
        this.timeLeft = timeLeft;
    }

    public ServerStatusResponse() {
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    public void setTimeLeft(Double timeLeft) {
        this.timeLeft = timeLeft;
    }
    
    
}
