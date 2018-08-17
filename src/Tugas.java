 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Tugas {
    private static void tampilJudul(String identitas)
    {
        System.out.println(identitas);
        System.out.println("");
        System.out.println("SELAMAT DATANG DI PROGRAM SAYA :)");
    }
    
    private static String tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat anda: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli: " + kalimat);
        
        return kalimat;
    }
    
    public static void main(String[] args) {
        
        String identitas = ("Rajasa Igor Bhirawa dari kelas X-RPL 3 / No. Absen: 33");
        tampilJudul(identitas);
        
    Scanner Rajasa = new Scanner(System.in);
    String[] username = {"Rajasa", "Rajasa"};
        System.out.println("");
        System.out.println("");
        
        System.out.println("Login Member");
        
        System.out.println("Username: ");
        String nama = Rajasa.next();
        
        int x, y;
        x = 0;
        
        for(y = 0; y < username.length; y++)
        {
            if (nama.equals(username[y]))
            {x = 1;}    
        }
        if (x == 1)
        {
            System.out.println("username tersedia");
        }    
        else
        { 
            System.out.println("data tidak tersedia");
        }    
        System.out.println("");
        System.out.println("----------------------------------");
        String kalimat = tampilInput();
        
        System.out.println("\"" + kalimat + "\" Panjang Karakter = " + kalimat.length() );
        System.out.println("");
        System.out.println("Jika kalimat dikecilkan, akan menjadi : ");
        System.out.println(kalimat.toLowerCase());
        System.out.println("");
        System.out.println("Jika kalimat dibesarkan, akan menjadi : ");
        System.out.println(kalimat.toUpperCase());
        System.out.println("----------------------------------");
        
        System.out.println("Terimakasih telah melihat dan mengunjungi program sederhana saya :)");
        System.out.println("Mohon maaf bila ada kesalahan atau kesederhanaan program ini");
        System.out.println("Wassalamualaikum Wr. Wb.");
    }
    
}
