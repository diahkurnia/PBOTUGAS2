/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hutan;

/**
 *
 * @author hp
 */ 
public class Pegawai extends Bagian {
    private String idPegawai;
    private String namaPegawai;

    public Pegawai(String idPegawai, String namaPegawai, String idBagian, String namaBagian) {
        super(idBagian, namaBagian);
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
 
}




