package com.example.aulaWeb6.controller;

import java.util.List;
import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class IController<T, ID> {
    // @Autowired
    // JpaRepository<T, ID> repository;

    @GetMapping
    public abstract List<T> findAll();
    
    @GetMapping
    public abstract Optional<T> findByID(@PathVariable ID id);

    @CrossOrigin
    @PostMapping
    public abstract void add(@RequestBody T value);
}
