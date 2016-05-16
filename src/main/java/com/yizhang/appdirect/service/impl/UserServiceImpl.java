package com.yizhang.appdirect.service.impl;

import com.yizhang.appdirect.resource.Response;

import com.yizhang.appdirect.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("userService")
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(SubscriptionServiceImpl.class);

    @Autowired
    OutboundTransport outboundTransport;

    public Response userAssignment(String eventUrl) {

        // TODO: internal implementation of user assginment
        return Response.success("message", "sample-account-id");
    }

    public Response userUnassignment(String eventUrl) {

        // TODO: internal implementation of user unassignment
        return Response.failure("error code", "message");
    }

}
