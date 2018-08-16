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
    
    private static String vocal2Angka(String kalimat)
    {
        char [][] arConvert = 
        {{'a', '4',},{'i', 'i'},{'u', '2'},{'e', '3'},{'o', 'o'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i = 0; i<arConvert.length; i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
    }
            
            
    public static void main(String[] args)
    {
     String identitas = "Rajasa Igor Bhirawa / X-RPL 3 / 33";
    
     tampilJudul(identitas);   
     
     String kalimat = tampilInput();
     
     String convert = vocal2Angka(kalimat);
     
     
    }           
    
    
    }
    
   
    

