/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kehutanan;

import hutan.Bagian;
import hutan.Pemakaian;

/**
 *
 * @author hp
 */
public class Kehutanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   
        // Create Bagian object
        Bagian bagian1 = new Bagian("M001", "Logitech");
        
        // Display Bagian information
        System.out.println("Informasi Bagian:");
        bagian1.displayBagianInfo();
        
        System.out.println();

        // Create Pemakaian object
        Pemakaian pemakaian1 = new Pemakaian("P001", "B001", "12345", "BG01", "23-05-2024", "Keperluan Kantor", "Tetap");

        // Display Pemakaian information
        System.out.println("Informasi Pemakaian:");
        pemakaian1.displayPemakaianInfo();
    }
}

        
   // TODO code application logic here
    
    

