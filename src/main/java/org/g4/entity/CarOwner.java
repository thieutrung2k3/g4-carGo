package org.g4.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.g4.entity.base.UserBase;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarOwner extends UserBase {
    @OneToOne
    @JoinColumn(name = "account_id", nullable = false, unique = true)
    Account account;

    @OneToMany(mappedBy = "carOwner", cascade = CascadeType.ALL)
    Set<Car> cars;
}
