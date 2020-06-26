package app.foo.service;

import app.foo.entity.Foo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
@Profile("experimental")
public class ExperimentalFooService implements FooService {

    private AtomicInteger atomicInteger = new AtomicInteger(); // JUST FOR THIS EXAMPLE

    @Override
    public Foo create() {
        return Foo.builder()
                .id(atomicInteger.getAndIncrement())
                .name("Experimental Foo")
                .build();
    }
}
