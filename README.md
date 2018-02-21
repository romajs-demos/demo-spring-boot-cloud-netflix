# demo-spring-cloud-netflix

[![java-jdk](https://img.shields.io/badge/java%20jdk-1.8-brightgreen.svg)]()
[![spring-boot](https://img.shields.io/badge/spring%20boot-1.4.0.RELEASE-green.svg)]()
[![spring-boot](https://img.shields.io/badge/spring%20cloud-Brixton.SR4-green.svg)]()

Tutorial: http://www.baeldung.com/spring-cloud-netflix-eureka

## Requirements

* Java JDK 8
* Apache Maven
* Docker-Compose

## Development

1. Build with maven: `mvn package`
2. Get environment running with docker-compose: `docker-compose up`

* Eureka Server: http://0.0.0.0:8761/
* Feign Client (get-greeting): http://0.0.0.0:8080/get-greeting