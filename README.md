# docker-compose-kafka-spring-angular-mongodb
Proof of Concept with Kafka, Producer, Consumer, App, Mongo Services

### Deploy
#### Open Gitbash and execute this
sh deploy.sh

### Dockers Commands

#### Stand Up
docker-compose up --build -d

#### Down Services
docker-compose down

#### Show All Containers
docker ps -a -n4

#### Show logs of a specific container
docker logs -f <id_container>

#### Show ip of specific container
docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' <container_id_or_name>
