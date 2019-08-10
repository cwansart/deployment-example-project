package de.openknowledge.de.projects.deploymentExampleProject.domain;

import de.openknowledge.de.projects.deploymentExampleProject.infrastructure.stereotypes.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class TimestampService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public String getDate() {
        return LocalDate.now().format(formatter);
    }
}
