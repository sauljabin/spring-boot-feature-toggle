# Feature Toggle Examples

Feature Toggle or Feature Flag, is 
a technique that allows teams to modify system behavior without changing code.

- [Foo](src/main/java/app/foo)  example is using `spring profiles` to activate
the correct bean, using the spring's [inversion of control](https://en.wikipedia.org/wiki/Inversion_of_control) and [dependency injection](https://en.wikipedia.org/wiki/Dependency_injection).

- [Bar](src/main/java/app/bar) example is using [configuration properties](https://www.baeldung.com/configuration-properties-in-spring-boot)
and the [strategy pattern](https://github.com/sauljabin/design-patterns-java#strategy) to activate the feature.  

## Commands

`make prod` run app with profile `prod` and experimental feature as `false`.

`make experimental` run app with profile `experimental` and experimental feature as `true`.

`make foo` hit foo endpoint.

`make bar` hit bar endpoint.

`make features` hit features endpoint.

`make test` run tests.

## Links

- https://www.martinfowler.com/articles/feature-toggles.html
- https://www.baeldung.com/spring-feature-flags