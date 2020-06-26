package app.foo.controller;

import app.foo.entity.Foo;
import app.foo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private FooService fooService;

    @Autowired
    public FooController(FooService fooService) {
        this.fooService = fooService;
    }

    @PostMapping("/foo")
    @ResponseBody
    public Foo createFoo() {
        return fooService.create();
    }
}
