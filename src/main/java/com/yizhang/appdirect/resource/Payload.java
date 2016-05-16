package com.yizhang.appdirect.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Payload
{
    private Account account;
    private Company company;
    private Order order;
    private Notice notice;
    private Configuration configuration;

    public Payload() {}

    public Payload(Account account, Company company, Order order, Notice notice, Configuration config)
    {
        this.notice = notice;
        this.order = order;
        this.company = company;
        this.account = account;
        this.setConfiguration(config);
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public Company getCompany()
    {
        return company;
    }

    public void setCompany(Company company)
    {
        this.company = company;
    }

    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }

    public Notice getNotice()
    {
        return notice;
    }

    public void setNotice(Notice notice)
    {
        this.notice = notice;
    }

    public Configuration getConfiguration()
    {
        return configuration;
    }

    public void setConfiguration(Configuration configuration)
    {
        this.configuration = configuration;
    }
}