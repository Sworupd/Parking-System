package models;

import java.time.LocalDateTime;

public class Payment {
    int Id;
    double amount;
    String paymentType;
    Ticket ticket;
    LocalDateTime paymenttime;
}
