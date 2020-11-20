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
public class Akatsuki {
    protected String name;
    protected int appears;
    protected String villain;
    protected String partner;
    protected String rings;
    protected String status;
    protected String gender;
    protected String jutsu;
    protected String abilities;
    
    public Akatsuki(String n, int ap, String v, String p, String r, String s, String g, String j, String ab){
        this.name = n;
        this.appears = ap;
        this.villain = v;
        this.partner = p;
        this.rings = r;
        this.status = s;
        this.gender = g;
        this.jutsu = j;
        this.abilities = ab;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAppears(){
        return appears;
    }
    
    public String getVillain(){
        return villain;
    }
    
    public String getPartner(){
        return partner;
    }
    
    public String getRings(){
        return rings;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getJutsu(){
        return jutsu;
    }
    
    public String getAbilities(){
        return abilities;
    }
    
    public void whoAreYou(){
        System.out.println("Hello, I am "+name+" from Akatsuki team");
    }
}
