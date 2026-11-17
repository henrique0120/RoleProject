package io.github.henrique0120.Role.service;

import io.github.henrique0120.Role.model.establishment;
import io.github.henrique0120.Role.repository.establishmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class establishmentService {

    private final establishmentRepository repository;

    public void save(establishment establishment) {
        repository.save(establishment);
    }

    public establishment findById(UUID id) {
        return repository.findById(id);
    }


}
