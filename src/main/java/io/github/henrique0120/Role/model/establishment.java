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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, length = 30)
    private establishmentType type;

    @Column(nullable = false)
    private String location;

    @Column(length = 100, nullable = false)
    private String description;

    @Override
    public String toString() {
        return "establishment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
