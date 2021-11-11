
package javacli;

import java.util.Scanner;

/**
 *
 * @author Ayu Asan
 */
public class JAVACLI {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModuleUtama();
        
    }
     public static void ModuleUtama(){
        Scanner s = new Scanner(System.in);
        System.out.println("/n{pilihan}");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Masukan Pilihan Anda: ");
        int choice = s.nextInt();
        switch (choice){
            case 1: ModuleTambah();break;
            case 2: ModuleKurang();break;
            case 3: ModuleKali();break;
            case 4: ModuleBagi();break;
        }
        
    }
     public static void ModuleTambah(){
        Scanner s = new Scanner(System.in);
         System.out.println("Penjumlahan");
         system.out.print("Maukan Nilai Pertama: ");
         double numl = s.nextDouble();
         System.out.println("maka hasil dari " + String.valueOf(numl) + "+" + String.valueOf(num2)+ "adalah" + (numl + num2));
         ModuleUtama();
         
    }
     public static void ModuleKurang(){
        Scanner s = new Scanner(System.in);
         System.out.println("Pengurangan");
         System.out.print("Masukan Nilai Pertama: ");
         double numl = s.nextDouble();
         System.out.print("Masukan Nilai Kedua: ");
         double num2 = s.nextDouble();
         System.out.println("maka hasil dari " + String.valueOf(numl) + "-" + String.valueOf(num2) + "adalah" + (numl - num2));
         ModuleUtama();
         
    }
     public static void ModuleKali(){
        Scanner s = new Scanner(System.in);
         System.out.println("Perkalian");
         System.out.print("Masukan Nilai Pertama: ");
         double numl = s.nextDouble();
         System.out.print("Masukan Nilai Kedua: ");
         double num2 = s.nextDouble();
         System.out.println("maka hasil dari " + String.valueOf(numl) + "*" + String.valueOf(num2) + "adalah" + (numl * num2));
         ModuleUtama();
         
    }
     public static void ModuleBagi(){
        Scanner s = new Scanner(System.in);
         System.out.println("Pembagian");
         System.out.print("Masukan Nilai Pertama: ");
         double numl = s.nextDouble();
         System.out.print("Masukan Nilai Kedua: ");
         double num2 = s.nextDouble();
         System.out.println("maka hasil dari " + String.valueOf(numl) + "/" + String.valueOf(num2) + "adalah" + (numl / num2));
         ModuleUtama();
     }
}