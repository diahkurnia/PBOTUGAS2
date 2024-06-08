/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hutan;

/**
 *
 * @author hp
 */
public class Pemakaian {
   
    private String kodePemakaian;
    private String kodeBarang;
    private String nip;
    private String kodeBagian;
    private String tanggalPakai;
    private String keperluan;
    private String statusPegawai;

    // Constructor
    public Pemakaian(String kodePemakaian, String kodeBarang, String nip, String kodeBagian, String tanggalPakai, String keperluan, String statusPegawai) {
        this.kodePemakaian = kodePemakaian;
        this.kodeBarang = kodeBarang;
        this.nip = nip;
        this.kodeBagian = kodeBagian;
        this.tanggalPakai = tanggalPakai;
        this.keperluan = keperluan;
        this.statusPegawai = statusPegawai;
    }

    public Pemakaian(String pM001, String k001, String b001, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and Setters
    public String getKodePemakaian() {
        return kodePemakaian;
    }

    public void setKodePemakaian(String kodePemakaian) {
        this.kodePemakaian = kodePemakaian;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKodeBagian() {
        return kodeBagian;
    }

    public void setKodeBagian(String kodeBagian) {
        this.kodeBagian = kodeBagian;
    }

    public String getTanggalPakai() {
        return tanggalPakai;
    }

    public void setTanggalPakai(String tanggalPakai) {
        this.tanggalPakai = tanggalPakai;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    // Method to display pemakaian information
    public void displayPemakaianInfo() {
        System.out.println("Kode Pemakaian: " + kodePemakaian);
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("NIP Pegawai: " + nip);
        System.out.println("Kode Bagian: " + kodeBagian);
        System.out.println("Tanggal Pakai: " + tanggalPakai);
        System.out.println("Keperluan: " + keperluan);
        System.out.println("Status Pegawai: " + statusPegawai);
    }
}

