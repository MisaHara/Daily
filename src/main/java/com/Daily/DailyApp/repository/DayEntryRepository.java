package com.Daily.DailyApp.repository;

import com.Daily.DailyApp.model.Mood;
import com.Daily.DailyApp.model.DayEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayEntryRepository extends JpaRepository<DayEntry, Long> {
    List<DayEntry> findByMoodIn(List<Mood> moods);
}
