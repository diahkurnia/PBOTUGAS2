/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_kehutanan_main;

import hutan.Bagian;
import hutan.Kategori;
import hutan.Pegawai;
import hutan.Pemakaian;
import java.util.Scanner;
import java.util.ArrayList;
import crud.koneksi;

/**
 *
 * @author hp
 */

public class main {
    public static void main(String[] args) {
        
        koneksi db = new koneksi();
        db.simpanPemakaian(paramkodePemakaian, paramkodeBarang, paramnip, paramkodeBagian, paramtanggalPakai, 0, 0, paramkodebarang, paramnik, paramkodebagian, paramtanggalpakai, paramstatuspegawai, paramkeperlua, 0);
    
        Bagian bagian = new Bagian("B001", "Pengelolaan Hutan");
        Pegawai pegawai = new Pegawai("P001", "Budi", "B001", "Pengelolaan Hutan");
        Kategori kategori = new Kategori("K001", "Alat Berat");
        Pemakaian pemakaian = new Pemakaian("PM001", "K001", "B001", "2024-06-03");

        System.out.println(bagian);
        System.out.println(pegawai);
        System.out.println(kategori);
        System.out.println(pemakaian);
    }
}

