# Sistem Aplikasi Web Hotel TI Unima

Projek akhir Mata Kuliah **Pemrograman Berorientasi Objek (PBO)** berbasis aplikasi web untuk pengelolaan dan pemesanan/reservasi kamar **Hotel TI Unima**.

## Tautan & Informasi Projek
- **Live Demo:** https://[tautan-hosting-publik-anda]
- **Repositori GitHub:** https://github.com/[username]/[nama-repo]
- **Kelas / Kelompok:** [Nama Kelas] – Kelompok [Nomor Kelompok]

## Akun Uji Coba (Jika Menggunakan Login/Role)
- **Admin:** `admin@contoh.com` | Password: `[PasswordAdmin]`
- **User / Tamu:** `user@contoh.com` | Password: `[PasswordUser]`

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Web, Spring Data JPA
- **Database:** MySQL / MariaDB (`db_hotel_ti_unima`)
- **Frontend:** HTML, CSS, JavaScript

## Menjalankan di Lokal (Development)
1. Pastikan MySQL/MariaDB aktif (misalnya melalui XAMPP) dan buat database `db_hotel_ti_unima`.
2. Salin file `.env.example` menjadi `.env` lalu sesuaikan kredensial database Anda:
   ```env
   DB_URL=jdbc:mysql://localhost:3306/db_hotel_ti_unima
   DB_USERNAME=root
   DB_PASSWORD=
   PORT=8080