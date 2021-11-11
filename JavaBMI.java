/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabmi;

import java.util.Scanner;

public class JavaBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        System.out.println("masukan berat : ");
        berat = input.nextInt();
        System.out.println("masukan tinggi");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("BMI Anda Adalah "+bmi);
        
        if (bmi<20.6) {
            System.out.println("berat badan anda kurang");
            
    }
        else if (bmi<25.5){
            System.out.println("berat badan anda ideal");
    } 
        else if (bmi<28.8){
            System.out.println("berat anda lebih");
    }
        else {
            System.out.println("OBESITAS");
        }
    }
    
}
