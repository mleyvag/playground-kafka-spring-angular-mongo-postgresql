# playground-kafka-spring-angular-mongo-postgresql
Proof of Concept
- Kafka
- Spring Boot
- MongoDB
- Postgresql
- Angular

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

#### Stats all services
docker stats --format "table {{.Container}}\t{{.CPUPerc}}\t{{.MemUsage}}" consumer_topic_one consumer_topic_two producer kafka zookeeper mongo web-app postgresql
