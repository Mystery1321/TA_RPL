package com.example.rental;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Mobil {
    private String nama;
    private String merk;
    private String jenistransmisi;
    private String kapasitas;
    private String harga;
    private String bahanbakar;

    public Mobil(String nama, String merk, String jenistransmisi, String kapasitas, String harga, String bahanbakar) {
        this.nama = nama;
        this.merk = merk;
        this.jenistransmisi = jenistransmisi;
        this.kapasitas = kapasitas;
        this.harga = harga;
        this.bahanbakar = bahanbakar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenistransmisi() {
        return jenistransmisi;
    }

    public void setJenistransmisi(String jenistransmisi) {
        this.jenistransmisi = jenistransmisi;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getBahanbakar() {
        return bahanbakar;
    }

    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }
    public StringProperty namaProperty() {
        return new SimpleStringProperty(nama);
    }

    public StringProperty merkProperty() {
        return new SimpleStringProperty(merk);
    }

    public StringProperty jenisProperty() {
        return new SimpleStringProperty(jenistransmisi);
    }
    public StringProperty kapasitasProperty() {
        return new SimpleStringProperty(kapasitas);
    }
    public StringProperty hargaProperty() {

        return new SimpleStringProperty(harga);
    }
    public StringProperty bahanbakarProperty() {
        return new SimpleStringProperty(bahanbakar);
    }
}
