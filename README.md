# demo-spring-cloud-netflix

[![java-jdk](https://img.shields.io/badge/java%20jdk-1.8-brightgreen.svg)]()
[![spring-boot](https://img.shields.io/badge/spring%20boot-2.0.0.RC1-brightgreen.svg)]()
[![spring-boot](https://img.shields.io/badge/spring%20cloud-Finchley.M6-brightgreen.svg)]()

Tutorial: http://www.baeldung.com/spring-cloud-netflix-eureka

## Requirements

* Java JDK 8
* Apache Maven
* Docker-Compose

## Development

1. Build: `mvn package`
2. Get environment up & running: `docker-compose up`

* Eureka-server: http://localhost:8761/
* Feign-client (get-greeting): http://localhost:8080/get-greeting
* Turbine stream: http://172.16.58.90:8082/turbine.stream
* Hystrix dashboard: http://172.16.58.90:8081/hystrix/monitor?stream=http%3A%2F%2F172.16.58.90%3A8082%2Fturbine.stream

*Obs: Wait for Feign-client to register with Eureka-server*