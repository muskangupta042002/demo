package com.muskan.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Booking{
    @Id @GeneratedValue
    private Long id;
    private String bookingName;

    public Booking(String bookingName){
        super();
        this.bookingName=bookingName;
    }
    public Booking(){

    }

    public Long getId(){
        return id;
    }

    public String getBookingName(){
        return bookingName;
    }
}
