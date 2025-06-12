CIS18B-S25-33479-Assignment5

This class project implements a flexible, type-safe notification system simulation in Java using generics and 3 classic design patterns.

Features:
- Generic Notification<T> system
- Multiple Observer types (SMS, Email, & Detailed)

Patterns:
- Factory Pattern
- Builder Pattern
- Observer Pattern

Architechture:

                <-------------->                                  
                | Observer     |                                    
                <-------------->                                     
                        ^                                                  
                        |                                                      
                   IMPLEMENTS                                               
                        |
          -------------------------------
          |             |               |
< ---------------->     |     <----------------->         
| SMSObserver     |     |     |EmailObserver    |          
< ---------------->     |     <----------------->
                        |
                  <------------------------------> 
                  | DetailedNotificationObserver |         
                  <------------------------------>

                <------------------------>                                  
                | NotificationFactory    |                                    
                <------------------------>                                     
                        ^                                                  
                        |                                                      
                   IMPLEMENTS                                               
                        |
          -------------------------------
          |                             |
< ---------------------->      <-------------------------->         
| SMSNotificationFactory|      | EmailNotificationFactory |        
< ---------------------->      <-------------------------->


                <----------------->                                  
                | Notification    |                                    
                <----------------->                                     
                        ^                                                  
                        |                                                      
                     EXTENDS                                               
                        |
          -------------------------------
          |             |               |
< ----------------->    |     <------------------->         
| SMSNotification| |    |     | EmailNotification |        
< ----------------->    |     <------------------->
                        |
              <----------------------> 
              | DetailedNotification |         
              <---------------------->

