# docker-compose-kafka-spring-angular-mongodb
Proof of Concept with Kafka, Producer, Consumer, App, Mongo Services

### Comands

#### Stand Up
docker-compose up --build -d

#### Down Services
docker-compose stop

#### Show All Containers
docker ps -a -n4

#### Show logs of a specific container
docker logs -f <id_container>

#### Show ip of specific container
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' bad1fbcee7d4


