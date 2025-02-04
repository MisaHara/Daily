package com.Daily.DailyApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "days")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DayEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Mood mood;

    @Column(length = 1000)
    private String description;

    @ElementCollection
    @CollectionTable(name = "day_tags", joinColumns = @JoinColumn(name = "day_id"))
    @Column(name = "tag")
    private List<String> tags;

    private LocalDate date;
}
