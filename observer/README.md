# Observer

## What it is

The Observer pattern is a behavioral design pattern that defines a one-to-many relationship between objects. In this pattern, one object, known as the "subject" or "observable," maintains a list of its dependents, known as "observers," and notifies them of state changes. When the state of the subject changes, all registered observers are automatically informed and updated.

![observer](./public/observer.png)

## Components
- **Subject (Observable)**: This is the object that maintains a list of observers and notifies them of changes. It provides methods to register, remove, and notify observers.

- **Observer**: This is the interface or base class for objects that want to be notified of changes in the subject. Observers implement an update method that is called when the subject's state changes.

- **Concrete Subject**: A specific implementation of the subject that manages its state and notifies observers when changes occur.

- **Concrete Observer**: A specific implementation of an observer that defines how it should react to updates from the subject.

## Concepts

- **Loose Coupling**: The Observer pattern promotes loose coupling between the subject and its observers. The subject doesn't need to know the specific classes of its observers, which makes the system more flexible and extensible.

- **Dynamic Binding**: Observers can be added or removed dynamically during runtime, allowing for dynamic behavior changes in the system.

- **Broadcast Mechanism**: The subject broadcasts updates to all registered observers, and each observer can react differently based on its implementation.

## Pros

1. **Flexibility and Extensibility**: The Observer pattern makes it easy to add or remove observers without modifying the subject, allowing for dynamic changes in behavior.

2. **Loose Coupling**: It promotes loose coupling between subjects and observers, making the code more modular and easier to maintain.

3. **Broadcast Mechanism**: It provides a broadcast mechanism that allows multiple objects to receive updates when a specific event occurs.

4. **Reusability**: Observers can be reused in different contexts with different subjects, promoting code reusability.

## Cons

1. **Complexity**: In some cases, implementing the Observer pattern can add complexity to the code, especially if there are many observers and complex notification logic.

2. **Memory Overhead**: Maintaining a list of observers can lead to memory overhead, especially in scenarios with a large number of observers.

3. **Order of Notification**: The order in which observers are notified may not be guaranteed, which can be a concern if the order of notification matters.

4. **Potential for Memory Leaks**: Care must be taken to remove observers when they are no longer needed to prevent memory leaks.

In summary, the Observer pattern is a powerful design pattern for building loosely coupled, dynamic systems where objects need to be notified of changes in the state of other objects. It offers flexibility and extensibility, but it should be used judiciously to avoid unnecessary complexity and potential memory issues.