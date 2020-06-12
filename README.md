# Spring-Boot-JMS
Sping Boot JMS integration using Apache ActiveMQ


# Messaging Basics

## What is Messaging 

Messaging is processing business data or information across application

![Basic Architecture](img/basic_architecture.png)

Some of the MQ
1. Apache Active MQ
2. Sonic MQ
3. Websphere MQ
4. TIBCO MQ
   
**Example of Message Queue**

Bank Teller can post a check in Messaging Server and Check processor can collects the data from there.

Both the services don't know about each other, if tomorrow someone wants to change the Check processor it can be done without changing the Bank Teller.

![Basic Architecture](img/example.png)

## Why Messaging

Messaging helps us to communicate between the different programming languages, operating systems.


![Basic Architecture](img/hospital_management.png)

- Before Messaging applications was loosely coupled
- Messaging reduce System Bottlenecks
- JMS use asynchronous listeners, which makes system scalable
- JMS provide flexibility and agility
  
## What is JMS

JMS (Java Message Service) is an API that provides the facility to create, send and read messages. It provides loosely coupled, reliable and asynchronous communication.

JMS helps us to send and receive messages or different MQ

JMS is for messaging as JDBC is for database

## The two messaging models

1. P2P : 
   - Message consumes only ones
   - Async Fire and Forget
   - Synchronous request/reply messaging
   - Example - mail
   

2. Pub/Sub : 
   - Message published to virtual channel called topic
   - Message producer called Publisher 
   - Message consumer called Subscriber
   - Messages automatically published to subscriber
   - Example - Newspaper

## JMS Provider

- Apache ActiveMQ Artemis

## Software Setup

1. Java 8 or higher
2. Spring Tool Suit
3. Apache ActiveMQ Artemis
   
## Create a Message Broker

1. Download https://activemq.apache.org/components/artemis/download/
2. Unzip
3. Go to bin
4. To create broker
   
        artemis create /D:\Practice\MQ
    
    ![Artemis Run](img/mq_installation.png)
   
   - `D:..` is the path where you want to create MQ
   - Put username and password
5. To start the Broker, go to directory where broker setup, go to the bin
   
        artemis run
    
    ![Artemis Run](img/mq_run.png)
