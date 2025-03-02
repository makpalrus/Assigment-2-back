### **📌 Ticket Booking System**  
A simple **Spring (without Spring Boot)** application for booking **flight and train tickets**. It demonstrates:  
- **Service Layer (`@Service`)** with multiple implementations.  
- **Dependency Injection (`@Primary`, `@Qualifier`)** to select the default or specific booking service.  
- **Repository Layer (`@Repository`)** for storing booked tickets.  
- **Spring Bean Initialization (`Eager & Lazy`)** using `@Component` and `@Lazy`.  
- **Spring Java-based Configuration (`@Configuration`, `@ComponentScan`)** without XML.  

---

## **📂 Project Structure**
```
📦 com.example
 ┣ 📂 config
 ┃ ┗ AppConfig.java      
 ┣ 📂 model
 ┃ ┗ Ticket.java         
 ┣ 📂 repository
 ┃ ┗ TicketRepository.java 
 ┣ 📂 service
 ┃ ┣ BookingService.java  
 ┃ ┣ FlightBookingService.java 
 ┃ ┗ TrainBookingService.java  
 ┣ 📂 singleton
 ┃ ┣ EagerBean.java    
 ┃ ┗ LazyBean.java      
 ┃ ┗ Main.java         
```

---


## **🚀 Features**
✅ Book **flight** and **train** tickets.  
✅ Uses **Spring Dependency Injection (@Autowired, @Service, @Repository)**.  
✅ **Eager & Lazy Bean Initialization**.  
✅ **Java-based Spring Configuration** (`@Configuration`, `@ComponentScan`).  

---

## **📌 Output**
```plaintext
EagerBean created.
Booking flight ticket: Ticket{id=1, passenger='Mereke', transport='Flight', destination='Astana', price=60000.0}
Booking train ticket: Ticket{id=2, passenger='Makpal', transport='Train', destination='Shymkent', price=10000.0}
LazyBean created.
```
