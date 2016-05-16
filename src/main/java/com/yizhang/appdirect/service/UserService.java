package com.yizhang.appdirect.service;

import com.yizhang.appdirect.resource.Response;

public interface UserService {

    /**
     * Assign a user to a service
     * @param eventUrl
     * @return response xml
     */
    public Response userAssignment(String eventUrl);

    /**
     * Unassign a user from a service
     * @param eventUrl
     * @return response xml
     */
    public Response userUnassignment(String eventUrl);

}
