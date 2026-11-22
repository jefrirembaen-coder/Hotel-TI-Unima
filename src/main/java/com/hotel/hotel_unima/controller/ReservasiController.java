package com.hotel.hotel_unima.controller;

import com.hotel.hotel_unima.model.Reservasi;
import com.hotel.hotel_unima.repository.ReservasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reservasi")
@CrossOrigin(origins = "*")
public class ReservasiController {

    @Autowired
    private ReservasiRepository repository;

    @GetMapping
    public List<Reservasi> getAllReservasi() {
        return repository.findAll();
    }

    @PostMapping
    public Reservasi buatReservasi(@RequestBody Reservasi reservasi) {
        if (reservasi.getId() == null || reservasi.getId().isEmpty()) {
            long count = repository.count() + 1;
            String dateStr = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
            reservasi.setId(String.format("RSV-%s-%03d", dateStr, count));
        }
        if (reservasi.getStatus() == null) {
            reservasi.setStatus("MENUNGGU");
        }
        return repository.save(reservasi);
    }

    @PutMapping("/{id}/status")
    public Reservasi updateStatus(@PathVariable String id, @RequestBody Map<String, String> body) {
        Reservasi reservasi = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservasi tidak ditemukan"));
        reservasi.setStatus(body.get("status"));
        return repository.save(reservasi);
    }
}