package com.sandbox.dropwizard.example.configuration;

import io.dropwizard.Configuration;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TODO :: Add DataBase configuration
 * @author kbober
 *
 */
public class ExampleConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty
    private HttpClientConfiguration httpClient = new HttpClientConfiguration();

    @NotNull
    private String queueHost;

    @NotNull
    private Integer queuePort;
    
    @Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();

    @Valid
    @NotNull
    private String simpleServiceTwoUrl;

    public HttpClientConfiguration getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClientConfiguration httpClient) {
        this.httpClient = httpClient;
    }

    public String getQueueHost() {
        return queueHost;
    }

    public void setQueueHost(String queueHost) {
        this.queueHost = queueHost;
    }

    public Integer getQueuePort() {
        return queuePort;
    }

    public void setQueuePort(Integer queuePort) {
        this.queuePort = queuePort;
    }

    public DataSourceFactory getDatabase() {
        return database;
    }

    public void setDatabase(DataSourceFactory database) {
        this.database = database;
    }

    public String getSimpleServiceTwoUrl() {
        return simpleServiceTwoUrl;
    }

    public void setSimpleServiceTwoUrl(String simpleServiceTwoUrl) {
        this.simpleServiceTwoUrl = simpleServiceTwoUrl;
    }       
}
