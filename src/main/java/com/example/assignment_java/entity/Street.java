package com.example.assignment_java.entity;

import com.example.assignment_java.entity.enums.StreetStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "streets")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="district_id", nullable = false)
    private Districts district;
    @Column(updatable = false, insertable = false)
    private int district_id;
    private String description;
    private LocalDate roadEstablishmentDate;
    @Enumerated(EnumType.ORDINAL)
    private StreetStatus status;
}
