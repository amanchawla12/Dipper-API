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
public class RequestResponse {
    
    private String status;
    
    public RequestResponse() {
        
    }
    
    public RequestResponse(String status) {
        
        this.status = status;
    }
    
    public void setStatus(String status) {
        
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
}
