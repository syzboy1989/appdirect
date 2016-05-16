package com.yizhang.appdirect.controller;

import com.yizhang.appdirect.resource.Response;
import com.yizhang.appdirect.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class User {

    private static Logger logger = Logger.getLogger(User.class);

    @Autowired
    UserServiceImpl userService;

    /**
     * assign user a service
     * @param request
     * @param url
     * @return response indicating success or failure
     */
    @RequestMapping(value="/assign", method = { RequestMethod.GET })
    public Response userAssign(HttpServletRequest request, @RequestParam String url) {
        logger.info(url);

        return userService.userAssignment(url);
    }

    /**
     * unassign a user from a service
     * @param request
     * @param url
     * @return response indicating success or failure
     */
    @RequestMapping(value = "/unassign", method = { RequestMethod.GET })
    public Response userUnassign(HttpServletRequest request, @RequestParam String url) {
        logger.info(url);

        return userService.userUnassignment(url);
    }

}
