/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.algoritma2;

/**
 *
 * @author User
 */
public class TumpukanApp {
 public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(9);
        tumpukan.baca();
        System.out.println("");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah Satria Cahyo Nugroho");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println("");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println("");
    }
}