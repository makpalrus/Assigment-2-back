package com.example.model;

public class Ticket {
    private int id;
    private String passengerName;
    private String transportType;
    private String destination;
    private double price;

    public Ticket(int id, String passengerName, String transportType, String destination, double price) {
        this.id = id;
        this.passengerName = passengerName;
        this.transportType = transportType;
        this.destination = destination;
        this.price = price;
    }

    public int getId() { return id; }
    public String getPassengerName() { return passengerName; }
    public String getTransportType() { return transportType; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Ticket{id=" + id + ", passenger='" + passengerName + "', transport='" + transportType +
                "', destination='" + destination + "', price=" + price + "}";
    }
}
