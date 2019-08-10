package de.openknowledge.de.projects.deploymentExampleProject.application;

import de.openknowledge.de.projects.deploymentExampleProject.domain.TimestampService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("timestamp")
public class TimestampResource {

    @Inject
    private TimestampService service;

    @GET
    public String getTimestamp() {
        return service.getDate();
    }
}
