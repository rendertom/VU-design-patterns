# Facade Design Pattern

## What it is

The Facade design pattern is a **structural design pattern** that provides a simplified interface to a complex subsystem of classes. It encapsulates the interactions and complexities of the subsystem, presenting clients with a more straightforward and unified interface. Essentially, it acts as a "facade" or entry point to a set of related functionality, shielding clients from the underlying complexity.

![Facade](./public/facade.png)


## Where to use it

1. **Complex Systems:** Use the Facade pattern when dealing with systems or libraries with intricate and interdependent components. It simplifies the usage of such systems by providing a single, higher-level interface.

2. **Subsystems:** It's beneficial when you want to expose only specific features of a subsystem while hiding the rest. This allows for better separation of concerns and reduces code coupling.

3. **Legacy Code Integration:** When integrating legacy code or third-party libraries into a modern application, a facade can help adapt the old code by providing a cleaner, modern interface.

### Pros

1. **Simplifies Usage:** Facades provide a simple and concise API, making it easier for clients to interact with complex subsystems.

2. **Encapsulation:** It encapsulates the complexity of the subsystem, promoting a clean separation of concerns between clients and the underlying implementation.

3. **Reduced Coupling:** Clients only depend on the facade, reducing dependencies on specific subsystem components. This makes the code more maintainable and less prone to changes in the subsystem.

### Cons

1. **Limited Flexibility:** By providing a simplified interface, the Facade pattern may limit access to advanced or less common features of the subsystem. Clients might need to access the subsystem directly for such functionality.

2. **Increased Abstraction:** In some cases, the Facade pattern can add an additional layer of abstraction, which might make it less suitable for very performance-critical code.

In summary, the Facade pattern is a useful tool for managing complexity in software systems by providing a clean, simplified interface for clients to interact with a complex subsystem. It promotes encapsulation, reduces coupling, and enhances maintainability in applications where complex interactions are involved.

## Demo

The **Facade** pattern provides a simplified interface to a complex system of classes. It acts as a higher-level interface that makes it easier for clients to interact with the subsystem.

- We have three subsystem classes: **CPU**, **RAM**, and **HD**, representing components of a computer system.

- The *ComputerFacade* class provides a simplified interface to start the computer. It hides the complexity of interacting with the subsystem classes.

- In the client code, we create a *ComputerFacade* object and use it to start the computer. The client doesn't need to know the details of how the CPU, RAM, and HD work; it simply uses the facade to perform the start operation.
- 