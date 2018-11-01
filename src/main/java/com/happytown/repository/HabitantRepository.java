package com.happytown.repository;

import com.happytown.core.entities.Habitant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface HabitantRepository extends JpaRepository<Habitant, UUID> {

    List<Habitant> findByDateArriveeCommuneLessThanEqualAndCadeauOffertIsNullAndDateAttributionCadeauIsNullOrderByDateArriveeCommune(LocalDate dateArriveeCommune);

}