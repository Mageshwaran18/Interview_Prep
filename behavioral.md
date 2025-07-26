# Behavioral Design Patterns 
    - It deals with the behavior of the objects and the actions that can be performed by the object. 
    - It deals how the communications happen with each other    
    - Makes the communication is flexible and loosely coupled 

## Strategy Design Patterns 
    - Define a family of algorithms or behaviors and choose the one to use during the runtime.
    - Provides different strategies to solve the same problem.

    Ex:- Payment method (different payment methods[paypal,credit....])  
        - Create an interface payment strategy with the function
        - Create concrete class for all the payment methods by implementing the payment strategy with the function definition
        - Now create paymentprocess class with the paymentstrategy has the reference variable. 
        - Now in the payment process class define a constructor which accepts that interface as arguments and assign them to the referrence variable
        - Now what ever the object of payment class object is created can be accessed by the paymentprocess  class using that particular interface referrence variable 
        - Create method to change the object of the referrence varibale pointing to dynamically 

    - Advantage :- 
        - Select behavior during the runtime 
        - Flexible switching between the objects