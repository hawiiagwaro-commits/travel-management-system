 Travel Agency Management System

 Project Description

This project is a Travel Agency Management System developed using Object-Oriented Programming (OOP) principles in Java. The system is designed to manage basic operations of a travel agency, including customers, employees, travel packages, and bookings.

The program allows users to input data dynamically such as customer details, employee information, and travel package details. It then processes bookings and payments while displaying relevant information.

The system demonstrates the use of key OOP concepts including abstraction, inheritance, encapsulation, and polymorphism.



 Features

* Create and manage customers and employees
* Create travel packages with destination, price, and duration
* Generate bookings for customers
* Apply discounts to travel packages
* Process payments
* Accept dynamic user input
* Handle errors using exception handling



 Classes Used

Abstract Classes

* `Person` – Base class for Customer and Employee
* `Service` – Base class for TravelPackage

 Interfaces

* `Payable` – Handles payment processing
* `Discountable` – Handles discount calculations

 Concrete Classes

* `Customer` – Stores customer details
* `Employee` – Stores employee details
* `TravelPackage` – Stores package details and calculates price
* `Booking` – Manages booking and payment

 Main Class

* `Main` – Runs the program and handles user interaction



 OOP Concepts Implemented

**Encapsulation**: Private variables with public getter methods
**Inheritance**: Customer and Employee inherit from Person; TravelPackage inherits from Service
**Abstraction**: Abstract classes (Person, Service) define common structure
**Polymorphism**: Method overriding in subclasses
**Interfaces**: Payable and Discountable define behaviors



 How to Run the Program

1. Save all `.java` files in the same folder

2. Open terminal in that folder

3. Compile the program:

   
   javac *.java
   

4. Run the program:

   
   java Main
   



Example Flow

1. User enters customer details
2. User enters employee details
3. User enters travel package details
4. Booking is created
5. User enters discount (optional)
6. User enters payment
7. System processes payment and displays results



 Exception Handling

The program uses a `try-catch-finally` block to handle errors such as invalid input types.

 If the user enters incorrect data (e.g., text instead of numbers), the program displays an error message instead of crashing.

 The `finally` block ensures the program ends properly and resources are closed.


Conclusion

This project demonstrates how Object-Oriented Programming concepts can be applied to build a simple but functional travel management system. It also shows how user input and exception handling improve program usability and reliability.

