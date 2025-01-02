# Work Order Generator

## Overview
The **Work Order Generator** demonstrates:
- Creating class files as templates for objects.
- Implementing inheritance and interfaces in Java.
- Reading and implementing UML diagrams to define relationships between classes.
- Managing file input/output operations and logging.

The project processes employee and ticket data, generates work orders, and outputs the results into a CSV file while maintaining detailed logs.

## Objectives
- Read data from CSV files and create `Employee`, `Ticket`, and `Customer` objects.
- Use inheritance, interfaces, and encapsulation to model relationships between classes.
- Dynamically assign tickets to employees and create `WorkOrder` objects.
- Write the `WorkOrder` data to a CSV file and log detailed information to a log file.

## Features
1. **File Input**:
   - Reads employee and ticket data from CSV files.
   - Uses the `FileHandler` class for reading input files and logging operations.

2. **Work Order Creation**:
   - Dynamically assigns tickets to employees, ensuring balanced workloads.
   - Stores the creation date and time of each `WorkOrder`.

3. **File Output**:
   - Writes the `WorkOrder` data to a new CSV file (`workorder_data.csv`).
   - Logs key events and detailed work order information in `log.txt`.

4. **Logging**:
   - Uses `FileHandler` to maintain logs with timestamps.
   - Logs events such as data loading, work order creation, and file writing.

## Requirements
- **Java Development Kit (JDK) 8 or higher**
- Input Files:
  - `employee_data.csv`
  - `ticket_data.csv`
- Output Files:
  - `workorder_data.csv`
  - `log.txt`

## Class Structure
### 1. **Person**
   - A base class representing shared attributes of `Employee` and `Customer`.
   - Attributes: `name`, `ID`.
   - Methods:
     - `getFileData()`: Returns CSV-formatted string of person data.
     - `getInfo()`: Returns detailed string of person data for logging.

### 2. **Employee (extends Person)**
   - Represents an employee with attributes like `employeeID` and `assignedTickets`.
   - Methods:
     - Inherits methods from `Person`.

### 3. **Customer (extends Person)**
   - Represents a customer associated with a ticket.
   - Includes customer-specific attributes such as `contactInfo`.
   - Methods:
     - Inherits methods from `Person`.

### 4. **Ticket**
   - Represents a ticket with attributes like `ticketID`, `description`, and associated `Customer`.
   - Methods:
     - `getFileData()`: Returns CSV-formatted string of ticket data.
     - `getInfo()`: Returns detailed string of ticket data for logging.

### 5. **WorkOrder**
   - Represents the assignment of a ticket to an employee.
   - Attributes:
     - `workOrderID`, `createdAt`, `Employee`, `Ticket`.
   - Methods:
     - `getFileData()`: Returns CSV-formatted string of work order data using data from `Employee` and `Ticket`.
     - `getInfo()`: Returns detailed string of work order data for logging.

### 6. **Project3**
   - Main class orchestrating the workflow:
     - Reads data from input files using `FileHandler`.
     - Processes data to create `WorkOrder` objects.
     - Outputs data to files using `FileHandler`.
     - Manages application flow and logging.

### 7. **DataHandler**
   - A utility class for managing in-memory data storage and processing.
   - Attributes:
     - `ArrayList<Employee>`, `ArrayList<Ticket>`, `ArrayList<WorkOrder>`.
   - Methods:
     - `createWorkOrders()`: Dynamically assigns tickets to employees and creates `WorkOrder` objects.
     - Handles data processing and cleanup on exceptions.

### 8. **FileHandler**
   - Handles reading and writing files and logging events.
   - Methods:
     - `readEmployee()`: Reads employee data from `employee_data.csv`.
     - `readTicket()`: Reads ticket and customer data from `ticket_data.csv`.
     - `writeData()`: Outputs `WorkOrder` data to `workorder_data.csv`.
     - `logger()`: Logs events to `log.txt` with timestamps.

## Implementation Details
### Input:
1. **Employee Data**:
   - Reads from `employee_data.csv` and creates `Employee` objects.
   - Ignores the header row in the file.

2. **Ticket Data**:
   - Reads from `ticket_data.csv`, creates `Ticket` objects, and associates them with `Customer` objects.

### Processing:
1. **Work Order Creation**:
   - Dynamically assigns tickets to employees based on ticket count and employee availability.
   - Ensures each `WorkOrder` includes the creation timestamp.

2. **Dynamic Assignment**:
   - Evenly distributes tickets among employees.
   - Example: 100 employees and 1,000 tickets result in 10 tickets per employee.

### Output:
1. **CSV File**:
   - Writes all `WorkOrder` data to `workorder_data.csv`.
   - Includes a header with columns like `EmployeeID`, `TicketID`, `CustomerName`, `WorkOrderDetails`, `CreatedAt`.

2. **Log File**:
   - Logs all events and details for each `WorkOrder` using `FileHandler.logger`.
   - Ensures logs include timestamps.
 
