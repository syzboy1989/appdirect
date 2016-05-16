package com.yizhang.appdirect.service.impl;

import com.yizhang.appdirect.resource.Response;
import com.yizhang.appdirect.resource.subscription.SubscriptionCancelEvent;
import com.yizhang.appdirect.resource.subscription.SubscriptionCreationEvent;
import com.yizhang.appdirect.resource.subscription.SubscriptionNoticeEvent;
import com.yizhang.appdirect.resource.subscription.SubscriptionUpdateEvent;
import com.yizhang.appdirect.service.SubscriptionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;


@Service("subscriptionService")
public class SubscriptionServiceImpl implements SubscriptionService {

    private static Logger logger = Logger.getLogger(SubscriptionServiceImpl.class);

    @Autowired
    OutboundTransport outboundTransport;

    public Response createSubscription(String eventUrl) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<SubscriptionCreationEvent> response =
                restTemplate.getForEntity(eventUrl, SubscriptionCreationEvent.class);
        SubscriptionCreationEvent creationEvent = response.getBody();
        Response processResult;
        try {
            // TODO: process creationEvent internally
            logger.info(creationEvent.getType());
            processResult = Response.success("success message","sameple-account-id");

        } catch (Exception e) {
            // TODO: map exception to error codes based on internal implementation
            processResult = Response.failure("Error code", "error message");
        }

        return processResult;
    }

    public Response updateSubscription(String eventUrl) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<SubscriptionUpdateEvent> response =
                restTemplate.getForEntity(eventUrl, SubscriptionUpdateEvent.class);
        SubscriptionUpdateEvent updateEvent = response.getBody();
        Response processResult;
        try {
            // TODO: process updateEvent internally
            logger.info(updateEvent.getType());
            processResult = Response.success("success message","sameple-account-id");

        } catch (Exception e) {
            // TODO: map exception to error codes based on internal implementation
            processResult = Response.failure("Error code", "error message");
        }

        return processResult;

    }

    public Response cancelSubscription(String eventUrl) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<SubscriptionCancelEvent> response =
                restTemplate.getForEntity(eventUrl, SubscriptionCancelEvent.class);
        SubscriptionCancelEvent cancelEvent = response.getBody();
        Response processResult;
        try {
            // TODO: process cancelEvent internally
            logger.info(cancelEvent.getType());
            processResult = Response.success("success message","sameple-account-id");

        } catch (Exception e) {
            // TODO: map exception to error codes based on internal implementation
            processResult = Response.failure("Error code", "error message");
        }

        return processResult;
    }

    public Response subscriptionNotice(String eventUrl) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<SubscriptionNoticeEvent> response =
                restTemplate.getForEntity(eventUrl, SubscriptionNoticeEvent.class);
        SubscriptionNoticeEvent noticeEvent = response.getBody();
        Response processResult;
        try {
            // TODO: process noticeEvent internally
            logger.info(noticeEvent.getType());
            processResult = Response.success("success message","sameple-account-id");

        } catch (Exception e) {
            // TODO: map exception to error codes based on internal implementation
            processResult = Response.failure("Error code", "error message");
        }

        return processResult;
    }

}
