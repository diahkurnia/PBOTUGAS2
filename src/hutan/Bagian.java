/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hutan;

/**
 *
 * @author hp
 */
public class Bagian {
    
    private String kodeMerek;
    private String merek;

    // Constructor
    public Bagian(String kodeMerek, String merek) {
        this.kodeMerek = kodeMerek;
        this.merek = merek;
    }

    // Getters and Setters
    public String getKodeMerek() {
        return kodeMerek;
    }

    public void setKodeMerek(String kodeMerek) {
        this.kodeMerek = kodeMerek;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Method to display bagian information
    public void displayBagianInfo() {
        System.out.println("Kode Merek: " + kodeMerek);
        System.out.println("Merek: " + merek);
    }
}


