# JMS Pub/Sub

**PreRequest**
1. Java
2. Apache Active MQ 
   
## Annotation

- @JmsListener:It marks a method to be the target of a JMS messagelistener on the specified destination.
- @SendTo annotation will take care of sending the return value of receiveMessage() to the destination defined in @SendTo.