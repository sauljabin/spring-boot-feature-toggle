package app.bar.service;

import app.bar.entity.Bar;

import java.util.concurrent.atomic.AtomicInteger;

public class DefaultBarStrategy implements BarStrategy {

    private AtomicInteger atomicInteger = new AtomicInteger(); // JUST FOR THIS EXAMPLE

    @Override
    public Bar create() {
        return Bar.builder()
                .id(atomicInteger.getAndIncrement())
                .name("Default Bar")
                .build();
    }
}
