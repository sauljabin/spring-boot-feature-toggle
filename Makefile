prod:
	SPRING_PROFILES_ACTIVE=prod FEATURE_EXPERIMENTAL=false ./gradlew bootRun

experimental:
	SPRING_PROFILES_ACTIVE=experimental FEATURE_EXPERIMENTAL=true ./gradlew bootRun

test:
	./gradlew test

actuator:
	curl http://localhost:8080/actuator | python -m json.tool

foo:
	curl -X POST http://localhost:8080/foo | python -m json.tool

bar:
	curl -X POST http://localhost:8080/bar | python -m json.tool