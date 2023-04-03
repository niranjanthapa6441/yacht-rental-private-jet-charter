package com.example.YachtAndPrivateJetRental.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "amenity")
public class Amenity {
    @Id
    private String id;

    @Column(nullable = false)
    private String amenity;

}
