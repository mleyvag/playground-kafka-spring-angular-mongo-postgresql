#!bin/sh
cd kafka-producer && \
mvn clean package && cd .. && \
cd kafka-consumer-topic-one && \
mvn clean package && cd .. && \
cd kafka-consumer-topic-two && \
mvn clean package && cd .. && \
docker-compose down && \
docker-compose up --build -d && \
docker ps -an6