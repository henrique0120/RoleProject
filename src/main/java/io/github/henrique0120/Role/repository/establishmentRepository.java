package io.github.henrique0120.Role.repository;

import io.github.henrique0120.Role.model.establishment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface establishmentRepository extends JpaRepository<establishment, UUID> {

    Optional<establishment> findById(UUID id);

    List<establishment> findAll();

//    void delete(UUID id);
}
