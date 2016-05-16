package com.yizhang.appdirect.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MarketPlace {
    private String baseUrl;
    private String partner;

    public MarketPlace() {}

    public MarketPlace (String partner, String baseUrl)
    {
        this.baseUrl = baseUrl;
        this.partner = partner;
    }

    public String getBaseUrl()
    {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl)
    {
        this.baseUrl = baseUrl;
    }

    public String getPartner()
    {
        return partner;
    }

    public void setPartner(String partner)
    {
        this.partner = partner;
    }
}