# OIBSIP_Train Reservation

This project is a simple **Train Ticket Reservation System**. It allows users to register, log in, view available seats, reserve seats & cancel seat reservations.

## How It Works:

1. **Registration & Login**:
   - Users begin by registering with a unique name and password.
   - After registration, they log in to access the reservation system.

2. **Main Menu Options**:
   - **1. View Available Seats**: Displays all seats, marking those that are reserved.
   - **2. Reserve a Seat**: Allows the user to reserve an available seat by entering the seat number (1-25).
   - **3. Cancel a Seat Reservation**: Enables the user to cancel a reservation by providing the reserved seat number.
   - **4. Exit**: Exits the reservation system.

3. **Seat Management**:
   - Seats are represented as a 25-element array where each element indicates if the seat is reserved.
   - Upon reservation or cancellation, the seat status updates accordingly.

## Code Overview:

- **Classes**:
   - `Reservation`: Handles the main functionalities, user inputs, and displays the menu.
   - `User`: Stores user details (name and password) and manages authentication.

- **Key Methods**:
   - `registerUser()`: Registers a new user with a unique name and password.
   - `authenticateUser()`: Authenticates the user based on the name and password entered.
   - `menu()`: Displays and manages the main menu options.
   - `viewseats()`: Shows the status of each seat (reserved or available).
   - `reserveseat()`: Reserves a seat if available.
   - `cancelseat()`: Cancels a reserved seat.



