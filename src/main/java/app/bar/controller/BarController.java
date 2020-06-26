package app.bar.controller;

import app.bar.entity.Bar;
import app.bar.service.BarService;
import app.bar.service.DefaultBarStrategy;
import app.bar.service.ExperimentalBarStrategy;
import app.common.config.FeatureConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    private BarService barService;
    private FeatureConfiguration featureConfiguration;

    @Autowired
    public BarController(BarService barService, FeatureConfiguration featureConfiguration) {
        this.barService = barService;
        this.featureConfiguration = featureConfiguration;
    }

    @PostMapping("/bar")
    @ResponseBody
    public Bar createBar() {
        if (featureConfiguration.isExperimental()) {
            barService.setBarStrategy(new ExperimentalBarStrategy());
        } else {
            barService.setBarStrategy(new DefaultBarStrategy());
        }

        return barService.create();
    }
}
