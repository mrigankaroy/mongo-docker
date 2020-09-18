# Spring Boot + Mongo DB + Docker

This is a sample application to demostrate application which build with spring boot, mongo db and docker.

### Installation

Build spring boot with mongo db application

```sh
$ mvn clean install
```
Now you can use below docker command to start, stop and build local image

```sh
docker-compose down
# make modifications
docker-compose build
docker-compose up
# test modifications
```

### Testing

Create a new Car

```sh
POST /car HTTP/1.1
Host: localhost:8082
Content-Type: application/json
Content-Type: text/plain

{
   "brand":"test-brand",
   "model":"test-model"
}
```
Get all cars
```sh
GET /car HTTP/1.1
Host: localhost:8082
Content-Type: application/json
Content-Type: text/plain

{
   "brand":"test-brand",
   "model":"test-model"
}
```
