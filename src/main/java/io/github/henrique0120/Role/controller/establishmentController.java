package io.github.henrique0120.Role.controller;

import io.github.henrique0120.Role.model.establishment;
import io.github.henrique0120.Role.service.establishmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/establish")
public class establishmentController {

    private final establishmentService service;

    @PostMapping
    public void save(@RequestBody establishment establishment) {
        service.save(establishment);
    }

    @GetMapping("/find")
    public List<establishment> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public establishment find(@PathVariable String id) {
        return service.findById(UUID.fromString(id));
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        service.delete(UUID.fromString(id));
    }

}
