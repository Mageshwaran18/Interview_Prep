# Structural Design Patterns 
    
    - Structural Design Patterns acts like an blueprints that shows how to connect different parts (classes/objects) together to build something bigger , While keeping it clean , flexible and reusable.

    - It helps you to connect things without creating mess.

    - Structural Design patterns helps you to glue different parts together in a smart and organized way.

## Adapter Design Patterns 

    It acts as a bridge between two incompatible interfaces, allowing them to work together seamlessly without modifying their code.

    - It helps two systems with different languages (interfaces) work together.
    
    - You have two or more classes that were not designed to work together (they have different method names, different logic, no shared parent or interface)…

    - But you want to use them in the same way — like they all have a common method, e.g., turnOn(). 
    
    - Airconditioner.startAc(), CoffeMachine.breqCoffee(),SmartLight.turnOnLight(). 

    - But as a user you want all things to be just turnOn() that's it. No need of details 

    - The Adapter Pattern lets you wrap different, unrelated classes and treat them the same way using a common interface.
