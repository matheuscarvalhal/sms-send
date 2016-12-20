/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sms.web.rest;

import com.cloudrail.si.CloudRail;
import com.cloudrail.si.services.Nexmo;
import java.util.Date;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

/**
 *
 * @author matheus carvalhal
 */
@Component
@Path("/sms")
public class SendSMS {

    private static final String APP_KEY = "585580e61376a6473e5a1192";
    private static final String KEY = "b1206eff";
    private static final String SECRET = "aea57e5fd6d38cc3";
    private Nexmo nexmo;
    
    @POST
    @Path("/send")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void sendSMS(Map<String, String> dictionary) {
        
        setAppKey();
        setCredentials();
        
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            
            String phone = entry.getKey();
            String message = entry.getValue();
            
            //getNexmo().sendSMS(sms.getFrom(), phone, message);
        }
        
    }
    
    @GET
    @Path("/getSMS")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Date getSMS() {
        
        return new Date();
        
    }

    public Nexmo getNexmo() {
        return nexmo;
    }

    public void setNexmo(Nexmo nexmo) {
        this.nexmo = nexmo;
    }
    
    public void setAppKey(){
        CloudRail.setAppKey(APP_KEY);
    }
    
    public void setCredentials(){
        if(nexmo==null){
            this.nexmo = new Nexmo(null, KEY, SECRET);
        }
    }
    
}