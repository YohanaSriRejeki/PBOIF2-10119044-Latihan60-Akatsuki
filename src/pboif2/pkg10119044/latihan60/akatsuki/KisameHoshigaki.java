/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan karakter Akatsuki
 */
public class KisameHoshigaki extends Akatsuki{
    private String uniqueTraits1;
    
    public KisameHoshigaki(String n, int ap, String v, String p, String r, String s, String g, String j, String ab) {
        super(n, ap, v, p, r, s, g, j, ab);
    }
    
    public String getUniqueTraits1(){
        return uniqueTraits1;
    }
    
    public void setUniqueTraits1(String ut){
        this.uniqueTraits1 = ut;
    }
    
    public void uniqueTraits(){
        System.out.println("Unique Traits : "+uniqueTraits1);
    }
    
    @Override 
    public void whoAreYou(){
        System.out.println("Hello, I am "+name+" from Akatsuki team");
    }
}
