# Springboot-kafka
Sample Springboot application with Kafka

## Install apache kafka
 To download and install Kafka, please refer to the official guide [here](https://kafka.apache.org/quickstart).
## Create a topic
 Create topi for request
 1. bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-demo
 

## Download the project 
 git clone https://github.com/GopinathYadavAR/springboot-kafka.git
 
## Run the project
    1. naviagate to project folder
    2. ./gradlew clean build
    3. gradle bootrun
    4. springboot-kafka application will run on localhost:8080    

### Invoke sample REST Endpoint
    Once application started then invoke 
    POST call http://localhost:8080/kafka with below paylaod 
    {
    	"name":"Gopi",
    	"employeeId": "123"
    }
    
