run:
	./gradlew bootRun

test:
	./gradlew test

actuator:
	curl http://localhost:8080/actuator | python -m json.tool

foo:
	curl http://localhost:8080/foo | python -m json.tool