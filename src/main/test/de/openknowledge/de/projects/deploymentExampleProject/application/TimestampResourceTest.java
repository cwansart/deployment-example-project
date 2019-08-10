package de.openknowledge.de.projects.deploymentExampleProject.application;

import de.openknowledge.de.projects.deploymentExampleProject.domain.TimestampService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TimestampResourceTest {

    @Mock
    private TimestampService service;

    @InjectMocks
    private TimestampResource resource;

    @Test
    public void getTimestamp() {
        when(service.getDate()).thenReturn("2019-10-25");

        assertThat(resource.getTimestamp()).isEqualTo("2019-10-25");
    }
}
