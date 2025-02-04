package com.Daily.DailyApp.controller;

import com.Daily.DailyApp.model.DayEntry;
import com.Daily.DailyApp.service.DayEntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/days")
@RequiredArgsConstructor
public class DayEntryController {
    private final DayEntryService service;

    @GetMapping
    public List<DayEntry> getAll() {
        return service.getAllEntries();
    }

    @PostMapping
    public DayEntry createEntry(@RequestBody DayEntry entry) {
        return service.saveEntry(entry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntry(@PathVariable Long id) {
        service.deleteEntry(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/filter")
    public List<DayEntry> getFiltered(@RequestParam boolean goodDays) {
        return service.getFilteredEntries(goodDays);
    }
}
