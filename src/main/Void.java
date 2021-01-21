/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class Void {
    //deklarasi variabel
    String hewan, makanan, jawab;
    
    //method 1 mengenai percabangan
    void percabangan(){
        //input user
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Hewan : ");
        hewan = input.nextLine();
        System.out.print("Masukkan Makanan : ");
        makanan = input.nextLine();
        
        //percabangan
        if (makanan.equalsIgnoreCase("Daging")) {
        System.out.println(hewan + " merupakan jenis hewan karnivora karena pemakan daging");
        }
        else if (makanan.equalsIgnoreCase("Tumbuhan")) {
        System.out.println(hewan + " merupakan jenis hewan herbivora karena pemakan tumbuhan");
        }
        else if (makanan.equalsIgnoreCase("Segala")) {
        System.out.println(hewan + " merupakan jenis hewan omnivora karena pemakan segala");
        }
        else if (makanan.equalsIgnoreCase("Serangga")) {
        System.out.println(hewan + " merupakan jenis hewan insektivora karena pemakan serangga");
        }
        else {
        System.out.println("error");
        }
        
        
        
    }
    //method 2 mengenai perulangan
    void perulangan(){
        Scanner input = new Scanner(System.in);
        //nilai output yang diinginkan dimasukkan oleh user
        System.out.print("Hewan " +hewan + " memiliki kebutuhan makanan sebanyak : ");
        int banyak = input.nextInt();
            //perulangan yang sesuai dengan input user
            for (int a=1; a<=banyak; a++ ){
            System.out.println(makanan);
            
        }
}
}