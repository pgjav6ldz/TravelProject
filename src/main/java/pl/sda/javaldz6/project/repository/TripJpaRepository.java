package pl.sda.javaldz6.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.javaldz6.project.model.Trip;

@Repository
public interface TripJpaRepository extends JpaRepository<Trip, Long> {
}
