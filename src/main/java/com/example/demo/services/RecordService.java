//package com.example.demo.services;
//
//import com.example.demo.entities.Record;
//import com.example.demo.repositories.RecordRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//
//@Service
//public class RecordService {
//    @Autowired
//    private RecordRepository systemRepository;
////    @Autowired
////    private AuthorRepository authorRepository;
////    @Autowired
////    private BookRepository bookRepository;
//
//    private List<Record> systems = new ArrayList<>();
//
//    public List<Record> getAllRecords() {
//        return StreamSupport.stream(systemRepository.findAll().spliterator(), false)
//                .collect(Collectors.toList());
//    }
//
//    public Record getRecord(Integer record) {
//        return this.systems.stream().filter(systems -> systems.getRow().equals(record)).findFirst().get();
//    }
//
//    public void addRecord(Record system) {
//        systemRepository.save(system);
//    }
//
//    public void deleteRecord(Integer record) {
//        systemRepository.deleteById(record);
//    }
//}
