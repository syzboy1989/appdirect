package com.yizhang.appdirect.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {

    private String country;

    private String name;

    private String email;

    private String phoneNumber;

    private String website;

    private String uuid;

    public Company() {}

    public Company(String country, String name, String email, String phone, String website, String uuid)
    {
        this.country = country;
        this.name = name;
        this.email = email;
        this.phoneNumber = phone;
        this.website = website;
        this.uuid = uuid;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Company [");
        builder.append("country=");
        builder.append(country);
        builder.append(", name=");
        builder.append(name);
        builder.append(", email=");
        builder.append(email);
        builder.append(", phone=");
        builder.append(phoneNumber);
        builder.append(", website=");
        builder.append(website);
        builder.append(", uuid=");
        builder.append(uuid);
        builder.append("]");
        return builder.toString();
    }
}