package io.github.henrique0120.Role.model;

import io.github.henrique0120.Role.enums.establishmentType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "establishment")
public class establishment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private establishmentType type;

    @Column(nullable = false)
    private String location;

    @Column(length = 100, nullable = false)
    private String description;

}
