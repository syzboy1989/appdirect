package com.yizhang.appdirect.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
    private Boolean success;
    private String message;
    private String accountIdentifier;
    private String errorCode;

    public Response() {

    }

    public Response(Boolean success, String error, String message)
    {
        this.accountIdentifier = null;
        this.message = message;
        this.success = success;
        this.errorCode = error;
    }

    public Response(Boolean success, String error, String message, String accountId)
    {
        this.accountIdentifier = accountId;
        this.message = message;
        this.success = success;
        this.errorCode = error;
    }

    public static Response success(String message, String accountId)
    {
        return new Response(true, null, message, accountId);
    }

    public static Response failure(String error, String message)
    {

        return new Response(false, error, message, null);
    }

    public Boolean getSuccess()
    {
        return success;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }

    public String getAccountIdentifier()
    {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountId)
    {
        this.accountIdentifier = accountId;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }
}
