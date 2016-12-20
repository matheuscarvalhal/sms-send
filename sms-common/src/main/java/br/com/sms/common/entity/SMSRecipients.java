/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sms.common.entity;

import java.util.Map;

/**
 *
 * @author matheuscarvalhal
 */
public class SMSRecipients {
    
    private String from;
    private Map<String, String> recipientsNotice;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Map<String, String> getRecipientsNotice() {
        return recipientsNotice;
    }

    public void setRecipientsNotice(Map<String, String> recipientsNotice) {
        this.recipientsNotice = recipientsNotice;
    }
    
}
