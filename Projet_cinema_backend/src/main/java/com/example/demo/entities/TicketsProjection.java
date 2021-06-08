package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Projection(name = "ticketProj",types = Ticket.class)
public interface TicketsProjection {
    public Long getId();
    public String getNomClient();
    public double getPrix();
    public Integer getCodePayment();
    public boolean geReserve();
    public Place getPlace();

}
