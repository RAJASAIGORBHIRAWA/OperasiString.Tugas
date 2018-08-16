/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class praktek02 {
    public static void tampilJudul(String identitas) 
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (vokal ke Angka)\n");
    }
    private static String tampilInput() 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }        
    public static void main(String[] args)
    {
     String identitas = "Rajasa Igor Bhirawa / X-RPL 3 / 33";
    
     tampilJudul(identitas);   
     
     String kalimat = tampilInput();
    }           
    
    
    }
    
   
    

