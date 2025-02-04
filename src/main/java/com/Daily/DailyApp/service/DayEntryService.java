package com.Daily.DailyApp.service;

import com.Daily.DailyApp.model.DayEntry;
import com.Daily.DailyApp.model.Mood;
import com.Daily.DailyApp.repository.DayEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DayEntryService {
    private final DayEntryRepository repository;

    public List<DayEntry> getAllEntries() {
        return repository.findAll();
    }

    public DayEntry saveEntry(DayEntry entry) {
        return repository.save(entry);
    }

    public void deleteEntry(Long id) {
        repository.deleteById(id);
    }

    public List<DayEntry> getFilteredEntries(boolean goodDays) {
        List<Mood> moods = goodDays ? List.of(Mood.VERY_GOOD, Mood.GOOD) :
                List.of(Mood.BAD, Mood.TERRIBLE);
        return repository.findByMoodIn(moods);
    }
}
