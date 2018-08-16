/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Locale;
public class Prak1 {
    public static void main(String[] args) 
    {
        String identitas = "Rajasa Igor B. / X-RPL 3 / 33";
        System.out.println("Identitas: " + identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x: " + x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong: " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z : " + z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "Operasi";
        System.out.println("isi variable r : " + r);
        System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("perbandingan isi x dengan y (Case Sensitive) : " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan y (Case Sensitive) : " + x.compareTo(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
        
        String s = "Operasi";
        System.out.println("isi variable s : " + s);
        System.out.println("Perbandingan isi r dengan (Case Sensitive) : " + r.compareTo(s));
   
    }
}
