package com.example;

import com.example.config.AppConfig;
import com.example.model.Ticket;
import com.example.service.BookingService;
import com.example.singleton.LazyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookingService flightService = context.getBean(BookingService.class);
        flightService.bookTicket(new Ticket(1, "Mereke", "Flight", "Astana", 60000.0));

        BookingService trainService = context.getBean("trainBookingService", BookingService.class);
        trainService.bookTicket(new Ticket(2, "Makpal", "Train", "Shymkent", 10000.0));

        context.getBean(LazyBean.class);

        context.close();
    }
}