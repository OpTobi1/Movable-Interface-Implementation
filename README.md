# Movable-Interface-Implementation
This project demonstrates the use of **Interfaces** in Java to create a common behavior for unrelated classes. It simulates a simple movement system involving a car, a player, and a ball.

## 🚀 Key Concepts
* **Interface Implementation:** Using the `Movable` interface to enforce `moveLeft()` and `moveRight()` methods across different classes.
* **Polymorphism:** Managing a mixed array of `Movable` objects and treating them uniformly.
* **Type Checking (instanceof):** Detecting specific types at runtime to execute unique behaviors (e.g., vertical movement for the `Ball` class).
* **Composition:** Using a helper `Point` class to manage coordinates within the `Ball` class.

## 📂 Class Structure
* **Movable (Interface):** Defines the contract for horizontal movement.
* **Point:** A utility class to represent (x, y) coordinates.
* **Car:** Implements `Movable` with a simple integer position.
* **Player:** Implements `Movable` and includes a name attribute.
* **Ball:** Implements `Movable` but also features unique `moveUp()` and `moveDown()` methods.

## 🛠 Simulation Logic
The `MainLab7` program performs the following:
1. Creates an array of various `Movable` items.
2. Simulates random horizontal movement for **all** items.
3. Uses **Downcasting** to apply unique vertical movement specifically to the `Ball` object.
4. Prints the final state and position of every object in the system.
