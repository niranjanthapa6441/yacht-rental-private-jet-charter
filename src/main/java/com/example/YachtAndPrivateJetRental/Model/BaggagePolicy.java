package com.example.YachtAndPrivateJetRental.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "baggage_policy")
public class BaggagePolicy {
    @Id
    private String id;
}
