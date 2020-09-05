#!bin/sh
#export MY_IP=192.168.1.40
cd kafka-producer && \
mvn clean package && cd .. && \
cd kafka-consumer-topic-one && \
mvn clean package && cd .. && \
cd kafka-consumer-topic-two && \
mvn clean package && cd .. && \
docker-compose down && \
docker-compose up --build -d && \
docker ps -an6 && \
docker logs -f consumer_topic_one