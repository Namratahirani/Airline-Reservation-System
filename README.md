

# Airline Reservation System  

## Overview  
The **Airline Reservation System** is a console-based application written in **Java** that allows users to perform essential airline booking operations. The system supports flight selection, booking tickets, canceling bookings, and searching for passenger details. It uses in-memory data structures such as **ArrayLists** to manage flight and booking information.  

---

## Features  

1. **Flight Details Display**:  
   - Displays a predefined list of available flights, including flight number, airline name, route, time, and date.  

2. **Flight Selection**:  
   - Users can select a flight by entering its flight number.  

3. **Ticket Booking**:  
   - Allows users to book tickets for multiple passengers.  
   - Calculates the total price, applying discounts for passengers under 18 and a tax rate of 18%.  
   - Displays the ticket details after booking, including passenger and flight information.  

4. **Booking Cancellation**:  
   - Users can cancel bookings by entering the passenger's name.  
   - Updates the total cost by removing the charges for the canceled passenger.  

5. **Passenger Search**:  
   - Allows users to search for a passenger's details by entering their name.  

---

## How It Works  

### Available Flights  
The system displays a list of predefined flights, for example:  
```
| SJ101 | Spicejet  | BOM to PNQ | 04:50 | 05/04/2024 |
| EM108 | Emirates  | BLR to DXB | 22:00 | 06/04/2024 |
| VS205 | Vistara   | DEL to BOM | 11:15 | 07/04/2024 |
| AI133 | AirIndia  | BLR to HYD | 09:25 | 08/04/2024 |
| SJ106 | Spicejet  | AMD to DXB | 23:00 | 09/04/2024 |
```  

### Booking Flow  
1. Users enter the flight number for the desired flight.  
2. Provide details for each passenger (name and age).  
3. The system calculates the total price, applying discounts for minors (under 18) and adds an 18% tax.  
4. Displays a ticket summary with all details.  

### Cancellation  
1. Users can cancel a booking by providing the passenger’s name.  
2. Removes the passenger’s details and updates the total price.  

### Passenger Search  
1. Enter the name of the passenger to search.  
2. Displays the passenger’s details and associated flight information.  

---

## Installation and Execution  

### Prerequisites  
- **Java JDK 8 or higher** installed.  
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or terminal for execution.  

### Steps to Run the Application  
1. Clone or download the project files:  
   ```bash  
   git clone https://github.com/your-repo/airline-reservation-system.git  
   cd airline-reservation-system  
   ```  

2. Open the project in your preferred IDE or compile and run it directly using the terminal:  
   ```bash  
   javac Airline_Reservation_System.java  
   java Airline_Reservation_System  
   ```  

---

## Usage  

1. **Program Menu**:  
   After starting the application, the menu will display:  
   ```
   Enter:
   1 Select flight
   2 Booking tickets
   3 Cancelling ticket
   4 Searching a passenger
   0 Exit
   ```  

2. **Flight Selection**:  
   Enter the flight number from the available flights.  

3. **Booking Tickets**:  
   Provide the number of passengers and their details (name and age).  
   Example:  
   ```
   Enter your name: John  
   Enter your age: 30  
   Enter your name: Jane  
   Enter your age: 15  
   ```  
   The system calculates the total charges with discounts for minors and taxes.  

4. **Canceling Tickets**:  
   Enter the name of the passenger whose booking you want to cancel.  

5. **Searching Passengers**:  
   Enter the name of the passenger to search for their details.  

---



