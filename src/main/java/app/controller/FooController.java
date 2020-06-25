package app.controller;

import app.entity.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class FooController {

    private AtomicInteger atomicInteger;

    @Autowired
    public FooController(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    @GetMapping("/foo")
    @ResponseBody
    public Foo getFoo() {
        return Foo.builder()
                .id(atomicInteger.getAndIncrement())
                .build();
    }
}
