Based on https://itnext.io/microservices-with-spring-boot-and-spring-cloud-16d2c056ba12
https://github.com/marcusdacoregio/oauth2-spring-boot/blob/master/config-server/src/main/resources/shared/application.yml

config-server
---------------
responsible to serve the spring configuration to every service
running port:8888

dependencies
config server
spring security

registry-service(eureka server)
----------------
responsible for the registration and discovery of services
running port:8761 ,this is the port at which eureka server runs

dependencies
spring-cloud-netflix Eureka server
config client

gateway-service(zuul)
-----------------
responsible to map the incoming requests to specific micro services, it can act as a load balancer
running port:8080

dependencies
config client
eureka discovery client
zuul

auth-service
--------------------
responsible auth of customer
running port:8081

dependencies
config client
eureka discovery client
spring web
spring security
spring data mongodb
cloud oauth2