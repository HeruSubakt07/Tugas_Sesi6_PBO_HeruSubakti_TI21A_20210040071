/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ground;

/**
 *
 * @author HeruSubakti_tugas6_20210040071_TI21A
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga = new SegiTiga(20, 10);
        BangunDatar lingkaran = new Lingkaran(10);
        
        
        System.out.println("Luas dati bangun datar segitiga: " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar  : " + lingkaran.getLuas());
    }
}