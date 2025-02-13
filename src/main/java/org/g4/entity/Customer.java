package org.g4.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.g4.entity.base.UserBase;

import java.awt.print.Book;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends UserBase {
    @OneToOne
    @JoinColumn(name = "account_id", nullable = false, unique = true)
    Account account;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    Set<Booking> bookings;
}
