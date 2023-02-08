# Configuration on the fly

## Run

1. Set the value for `spring.cloud.config.server.native.search-locations` in `liveconf-server/src/main/resources/application.properties`
2. Create an `application.yml` in that directory and put a line of `test.message: hello` in it.
3. Start `liveconf-server` by run `mvn spring-boot:run`
4. Start `liveconf-client` by run `mvn spring-boot:run`. You should see `hello` coming.
5. Open `application.yml` again and change `hello` to `world`
6. Send a **POST** request to http://localhost:8090/actuator/refresh
7.  You should see `world` coming.
