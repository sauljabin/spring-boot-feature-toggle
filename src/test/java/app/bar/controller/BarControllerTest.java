package app.bar.controller;

import app.bar.service.BarService;
import app.bar.service.DefaultBarStrategy;
import app.bar.service.ExperimentalBarStrategy;
import app.common.config.FeatureConfiguration;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BarControllerTest {

    @Test
    void invokeExperimentalFeature() {
        BarService barService = mock(BarService.class);
        FeatureConfiguration configuration = mock(FeatureConfiguration.class);
        when(configuration.isExperimental()).thenReturn(true);
        BarController barController = new BarController(barService, configuration);

        barController.createBar();

        verify(barService).setBarStrategy(isA(ExperimentalBarStrategy.class));
    }

    @Test
    void invokeDefaultFeature() {
        BarService barService = mock(BarService.class);
        FeatureConfiguration configuration = mock(FeatureConfiguration.class);
        when(configuration.isExperimental()).thenReturn(false);
        BarController barController = new BarController(barService, configuration);

        barController.createBar();

        verify(barService).setBarStrategy(isA(DefaultBarStrategy.class));
    }
}