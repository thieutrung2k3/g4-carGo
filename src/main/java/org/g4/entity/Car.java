package org.g4.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String licensePlate;

    @Column(nullable = false)
    String brand;

    @Column(nullable = false)
    String model;

    @Column(nullable = false)
    String color;

    @Column(nullable = false)
    int numberOfSeats;

    @Column(nullable = false)
    int productionYears;

    @Column(nullable = false)
    String transmissionType;

    @Column(nullable = false)
    String fuelType;

    @Column(nullable = false)
    int mileage;

    @Column(nullable = false)
    double fuelConsumption;

    @Column(nullable = false)
    double basePrice;

    @Column(nullable = false)
    double deposit;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    String additionalFunctions;

    @Column(nullable = false)
    String termsOfUse;

    @Column(nullable = false)
    String imageUrl;

    @ManyToOne
    @JoinColumn(name = "car_owner_id", nullable = false)
    CarOwner carOwner;
}
