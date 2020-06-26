package app.common.controller;

import app.common.config.FeatureConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeaturesController {

    private FeatureConfiguration featureConfiguration;

    @Autowired
    public FeaturesController(FeatureConfiguration featureConfiguration) {
        this.featureConfiguration = featureConfiguration;
    }

    @GetMapping("/features")
    @ResponseBody
    public FeatureConfiguration createBar() {
        return featureConfiguration;
    }
}
