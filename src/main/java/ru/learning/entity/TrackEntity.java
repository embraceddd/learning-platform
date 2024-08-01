package ru.learning.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "track")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
