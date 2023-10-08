# Chain of Responsibility

## What it is

The Chain of Responsibility pattern is a behavioral design pattern that promotes the idea of passing a request along a chain of handlers. Each handler in the chain decides whether to handle the request or pass it to the next handler in the chain. The primary goal of this pattern is to decouple the sender of a request from its receiver, allowing multiple objects to have a chance to handle the request without the sender needing to know which object will ultimately process it.

![Chain of Responsibility](./public/chain-of-responsibility.png)

## Components

1. **Handler Interface**: Defines a common interface for all concrete handlers. This interface typically includes methods for setting the next handler and handling requests.

2. **Concrete Handlers**: Concrete classes that implement the Handler interface. Each concrete handler knows how to process a specific type of request. If it can't handle the request, it passes it to the next handler in the chain.

3. **Client**: Initiates requests and passes them to the first handler in the chain.

## Pros

1. **Flexibility**: It provides a flexible way to add or remove handlers dynamically without affecting the client code. You can easily extend the chain with new handlers.

2. **Decoupling**: It promotes loose coupling between the sender and receiver of a request. The client code doesn't need to know the specific handler that will process the request.

3. **Responsibility Chain**: It allows you to create a chain of responsibility, where each handler is responsible for a specific aspect of the request. This makes it easy to organize and manage the handling logic.

4. **Single Responsibility Principle**: Each handler has a single responsibility, making it easier to maintain and understand the codebase.

## Cons

1. **Overhead**: In some cases, there can be overhead associated with traversing the entire chain of handlers, especially if the chain is long or if most handlers cannot handle the request.

2. **Complexity**: If not used carefully, the pattern can lead to a complex and hard-to-understand chain of handlers, making it challenging to debug and maintain.

3. **Unprocessed Requests**: If the chain is not constructed properly, it is possible that a request may go unprocessed if no handler in the chain can handle it.

4. **Performance**: Performance can be a concern when the chain of handlers is long, as each handler must be invoked in sequence. This may not be suitable for high-performance or real-time systems.

In summary, the Chain of Responsibility pattern is useful when you want to decouple the sender and receiver of a request and provide a flexible way to process requests with a chain of handlers. It's particularly helpful when the exact processing logic for a request may vary at runtime or when you want to organize responsibilities in a hierarchical manner. However, it should be used judiciously, as it can introduce complexity and potential performance issues if not applied carefully.