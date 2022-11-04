package com.example.aulaWeb6.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jpa.repository.JpaRepository;

public interface IController<T, ID> {
    @GetMapping(value = "/todos")
    public abstract List<T> findAll();
    
    @GetMapping(value = "/{id}")
    public abstract Optional<T> findByID(@PathVariable(value = "id") ID id);

    @CrossOrigin
    @PostMapping("/inserir")
    public abstract void add(@RequestBody T value);
}
