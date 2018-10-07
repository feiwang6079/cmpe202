# lab4

CLASS: Customer

RESPONSIBLITIES:
Knows name
Knows cellNumber
Knows number of people in their party
Registers on the wait list
Receives message 
Replys message

COLLABORATORS:
DinTaiFungServer
MessageServer

CLASS: DinTaiFungServer

RESPONSIBLITIES:
Knows which customers there are.
Handles the situation that table is ready for customer
Handles customer response information.

COLLABORATORS:
Inspector
MessageServer


CLASS: Inspector

RESPONSIBLITIES:
Check if the seat meets the number of customers

COLLABORATORS:
MessageServer

Class: MessageServer

RESPONSIBLITIES:
Send message to customer
Send response message from customer to DinTaiFungServer

COLLABORATORS:
Customer
DinTaiFungServer

I chose the singleton Pattern and Chain of Responsibility in the design.
DinTaiFungServer and MessageServer play Singleton in the Pattern, because DinTaiFungServer need to maintain three list of customers. Even though each customer could call the methods added to wait list, it is only an object of DinTaiFungServer to handle. In reality, only one message server could handle the function of sending message, so MessageServer must be designed as a singleton.
When table is ready, the custom get the message. If they choose to leave, the next custom will get the message and make a choice. As long as any customer agrees, no more information will be sent to the next customer. So, it's appropriate to use  Chain of Responsibility.


