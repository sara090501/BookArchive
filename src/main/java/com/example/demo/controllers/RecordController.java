//package com.example.demo.controllers;
//
//import com.example.demo.entities.Record;
//import com.example.demo.services.RecordService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class RecordController {
//    private final RecordService recordService;
//
//    @GetMapping(value = "/record")
//    public List<Record> getAllBooks() {
//        return this.recordService.getAllRecords();
//    }
//
//    @PostMapping(value = "/record/add")
//    public void addRecord(@RequestBody Record record) {
//        this.recordService.addRecord(record);
//    }
//
//    @DeleteMapping(value = "/record/{record}")
//    public void deleteRecord(@PathVariable Integer record) {
//        this.recordService.deleteRecord(record);
//    }
//}
