package de.openknowledge.de.projects.deploymentExampleProject.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class TimestampServiceTest {

    private TimestampService service;

    @Before
    public void setUp() {
        service = new TimestampService();
    }

    @Test
    public void getTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String expected = LocalDate.now().format(formatter);

        String date = service.getDate();

        assertThat(date).isEqualTo(expected);
    }
}
