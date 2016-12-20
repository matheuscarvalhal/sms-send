/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sms.web.rest.config;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author matheu
 */
public class SMSResourceConfig extends ResourceConfig {

    public SMSResourceConfig() {
        register(SMSJacksonFeature.class);
        register(MultiPartFeature.class);
        packages("br.com.sms.web.rest");
    }
}
