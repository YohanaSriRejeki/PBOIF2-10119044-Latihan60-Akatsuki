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
public class Orochimaru extends Akatsuki{
    private String uniqueTraits3;
    
    public Orochimaru(String n, int ap, String v, String p, String r, String s, String g, String j, String ab) {
        super(n, ap, v, p, r, s, g, j, ab);
    }
    
    public String getUniqueTraits3(){
        return uniqueTraits3;
    }
    
    public void setUniqueTraits3(String ut){
        this.uniqueTraits3 = ut;
    }
    
    public void uniqueTraits3(){
        System.out.println("Unique Traits : "+uniqueTraits3);
    }

    @Override 
    public void whoAreYou(){
        System.out.println("Hello, I am "+name+" from Akatsuki team");
    }
}
