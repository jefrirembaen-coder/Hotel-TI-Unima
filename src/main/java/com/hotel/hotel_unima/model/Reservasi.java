package com.hotel.hotel_unima.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservasi")
public class Reservasi {

    @Id
    private String id;

    private String nama;
    private String telepon;
    private String email;
    private String alamat;

    private LocalDate checkin;
    private LocalDate checkout;

    private int dewasa;
    private int anak;
    private String tipeKamar;
    private int extraBed;

    private String preferensiLokasi;
    @Column(columnDefinition = "TEXT")
    private String permintaanKhusus;

    private String metodeBayar;
    private double deposit;
    private String noKartu;

    private String tujuan;
    @Column(columnDefinition = "TEXT")
    private String catatan;
    private String sumber;

    private String memberId;
    private int poin;

    private String status;

    public Reservasi() {}

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTelepon() { return telepon; }
    public void setTelepon(String telepon) { this.telepon = telepon; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public LocalDate getCheckin() { return checkin; }
    public void setCheckin(LocalDate checkin) { this.checkin = checkin; }

    public LocalDate getCheckout() { return checkout; }
    public void setCheckout(LocalDate checkout) { this.checkout = checkout; }

    public int getDewasa() { return dewasa; }
    public void setDewasa(int dewasa) { this.dewasa = dewasa; }

    public int getAnak() { return anak; }
    public void setAnak(int anak) { this.anak = anak; }

    public String getTipeKamar() { return tipeKamar; }
    public void setTipeKamar(String tipeKamar) { this.tipeKamar = tipeKamar; }

    public int getExtraBed() { return extraBed; }
    public void setExtraBed(int extraBed) { this.extraBed = extraBed; }

    public String getPreferensiLokasi() { return preferensiLokasi; }
    public void setPreferensiLokasi(String preferensiLokasi) { this.preferensiLokasi = preferensiLokasi; }

    public String getPermintaanKhusus() { return permintaanKhusus; }
    public void setPermintaanKhusus(String permintaanKhusus) { this.permintaanKhusus = permintaanKhusus; }

    public String getMetodeBayar() { return metodeBayar; }
    public void setMetodeBayar(String metodeBayar) { this.metodeBayar = metodeBayar; }

    public double getDeposit() { return deposit; }
    public void setDeposit(double deposit) { this.deposit = deposit; }

    public String getNoKartu() { return noKartu; }
    public void setNoKartu(String noKartu) { this.noKartu = noKartu; }

    public String getTujuan() { return tujuan; }
    public void setTujuan(String tujuan) { this.tujuan = tujuan; }

    public String getCatatan() { return catatan; }
    public void setCatatan(String catatan) { this.catatan = catatan; }

    public String getSumber() { return sumber; }
    public void setSumber(String sumber) { this.sumber = sumber; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public int getPoin() { return poin; }
    public void setPoin(int poin) { this.poin = poin; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}