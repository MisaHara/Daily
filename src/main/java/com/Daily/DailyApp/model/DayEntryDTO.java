package com.Daily.DailyApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DayEntryDTO {
    private Mood mood;
    private String description;
    private List<String> tags;
    private LocalDate date;
}
