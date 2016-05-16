package com.yizhang.appdirect.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth.common.signature.SharedConsumerSecretImpl;
import org.springframework.security.oauth.consumer.BaseProtectedResourceDetails;
import org.springframework.security.oauth.consumer.client.OAuthRestTemplate;

import org.springframework.stereotype.Service;

@Service("transportService")
public class OutboundTransport {

    @Value("${oauth.key}")
    private String key;

    @Value("${oauth.secret}")
    private String secret;

    private OAuthRestTemplate oauthRestTemplate;

    private static Logger logger = Logger.getLogger(OutboundTransport.class);

    public <T> T getEvent(String eventUrl, Class<T> resultType) {
        // Sign the outbound request to appdirect
        BaseProtectedResourceDetails resourceDetails = new BaseProtectedResourceDetails();
        resourceDetails.setId("test");
        resourceDetails.setConsumerKey(key);
        resourceDetails.setSharedSecret(new SharedConsumerSecretImpl(secret));
        resourceDetails.setUse10a(true);
        oauthRestTemplate = new OAuthRestTemplate(resourceDetails);
        T eventEntity = oauthRestTemplate.getForEntity(eventUrl, resultType).getBody();

        return eventEntity;
    }

}
