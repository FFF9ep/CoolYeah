# Online Ticket Booking System

## General Description

This program is designed to provide online ticket booking services for tourism. Users can choose between two types of tickets: regular tickets and pass tickets. Ticket prices vary based on age (adult or child) and also consider the day of booking, with increased prices on weekends.

## Key Features

1. **Ticket Type Selection:**

   - Users can choose between regular tickets and pass tickets.

2. **Price Calculation:**

   - Ticket prices vary depending on the type of ticket and age (adult or child).
   - Ticket prices increase by 20% on Saturdays and Sundays.

3. **User Information Input:**

   - Users are required to enter their name, day, date, and the number of tickets they wish to purchase.
   - Input validation ensures that all data is filled out correctly.

4. **Order Data Storage:**

   - Information about each order is stored in objects for use in invoice display.

5. **Invoice:**
   - The program displays an invoice detailing all order information, including name, day, date, quantity, ticket type, and total amount spent.
   - The overall total is calculated and displayed at the end.

## Usage Example

1. Run the program.
2. Select the desired ticket type (1 for regular tickets, 2 for pass tickets).
3. Enter the requested information:
   - Name
   - Day
   - Date
   - Quantity of tickets
4. After completion, the program will display an invoice with all order details and total cost.

## System Requirements

- Java Development Kit (JDK) version 8 or higher.
- An IDE or text editor to run and edit the code.

## How to Run the Program

1. Ensure that JDK is installed on your system.
2. Download or clone this repository.
3. Open the terminal and navigate to the directory where the Java files are located.
4. Run the following commands to compile and execute the program:
   ```bash
   javac TicketBooking.java
   java TicketBooking
   ```
