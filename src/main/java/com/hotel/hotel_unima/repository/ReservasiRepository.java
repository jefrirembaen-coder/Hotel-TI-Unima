package com.hotel.hotel_unima.repository;

import com.hotel.hotel_unima.model.Reservasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasiRepository extends JpaRepository<Reservasi, String> {
}