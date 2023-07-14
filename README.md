# kafka-local-Demo
To run this you need to start zookeeper and server in your local machine, Refer this - 
GET STARTED WITH KAFKA IN WINDOWS

1.	Download Kafka from - https://kafka.apache.org/quickstart
2.	Extract zip file to anywhere but C drive is preferred.
3.	We can see in bin folder there are shell script which we can’t run on windows.
4.	Change the name of the extracted folder to kafka(Optional*).
5.	We will execute commands which are under bin\windows, and all are .bat files which we can easily run on windows.
6.	If we go under config folder we can see there are consumer.properties , producer.properties, server.properties, zookeeper.properties.
7.	We can change this properties file to change the port number or logs directory and many more as per our need.
8.	Open terminal from kafka folder (type cmd on path and press enter)
9.	To start zookeeper, run this command - “.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties”.
10.	Open new terminal from kafka folder again.
11.	To start server, run this command – “.\bin\windows\kafka-server-start.bat .\config\server.properties”
12.	 Open new terminal from bin\windows folder.
13.	To create topic, run this command – “kafka-topics.bat --create --bootstrap-server localhost:9092 --topic topic_name”.
14.	To run the producer, use the same terminal and run this command – “kafka-console-producer.bat --broker-list localhost:9092 --topic topic_name”.
15.	Open new terminal from bin\windows folder.
16.	To run the consumer, run this command – “kafka-console-consumer.bat --topic topic_name --bootstrap-server localhost:9092 --from-beginning”.
17.	Now if you write anything in the producer terminal you can get it in the consumer terminal.
18.	Reference video - https://www.youtube.com/watch?v=BwYFuhVhshI
19.	Reference video - https://www.youtube.com/watch?v=SqVfCyfCJqw&t=2433s

