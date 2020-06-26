package app.bar.service;

import app.bar.entity.Bar;
import org.springframework.stereotype.Service;

@Service
public class BarService {

    private BarStrategy barStrategy;

    public void setBarStrategy(BarStrategy barStrategy) {
        this.barStrategy = barStrategy;
    }

    public Bar create(){
        return barStrategy.create();
    }
}
