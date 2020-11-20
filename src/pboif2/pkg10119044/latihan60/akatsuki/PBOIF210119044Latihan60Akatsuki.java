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

public class PBOIF210119044Latihan60Akatsuki {
    public static void main(String[] args) {
        System.out.println("===Akatsuki Characters==="+"\n");
        
        Deidara dei = new Deidara("Deidara", 26, "Iwagakure", "Sasori,Tobi", "Right Index Finger: \"blue\",\"green\"; color teal",
                                 "Committed suicide while fighting Sasuke Uchiha", "male", "C0-C4,Clay Clone,Earth Release: Hiding Like A Mole Technique, etc.",
                                 "intelligence");
        dei.whoAreYou();
        System.out.println("Name      :"+dei.getName());
        System.out.println("Appears   :"+dei.getAppears());
        System.out.println("Villain   :"+dei.getVillain());
        System.out.println("Partner   :"+dei.getPartner());
        System.out.println("Ring      :"+dei.getRings());
        System.out.println("Status    :"+dei.getStatus());
        System.out.println("Sex       :"+dei.getGender());
        System.out.println("Jutsu     :"+dei.getJutsu());
        System.out.println("Abilities :"+dei.getAbilities());
        
        System.out.println();
        Hidan hid = new Hidan("Hidan", 16, "Yugukagure", "Kakazu", "Left index finger: \"three\"; color orange",
                                 "Buried by Shikamaru Nara", "male", "Curse Technique: Death Controlling Possessed Blood",
                                 "immortality, physical prowess, jujutsu");
        hid.whoAreYou();
        System.out.println("Name      :"+hid.getName());
        System.out.println("Appears   :"+hid.getAppears());
        System.out.println("Villain   :"+hid.getVillain());
        System.out.println("Partner   :"+hid.getPartner());
        System.out.println("Ring      :"+hid.getRings());
        System.out.println("Status    :"+hid.getStatus());
        System.out.println("Sex       :"+hid.getGender());
        System.out.println("Jutsu     :"+hid.getJutsu());
        System.out.println("Abilities :"+hid.getAbilities());
        
        System.out.println();
        ItachiUchiha itachi = new ItachiUchiha("Itachi Uchiha", 39, "Konohagakure", "Kisame", "Right ring finger: \"vermillion\",\"scarlet\"; color red",
                                 "Succumbed to illness while fighting Sasuke Uchiha", "male", "Amaterasu, Demonic Illusion, etc. ",
                                 "genjutsu, dojutsu (sharingan, mangekyo sharingan),");
        itachi.whoAreYou();
        System.out.println("Name      :"+itachi.getName());
        System.out.println("Appears   :"+itachi.getAppears());
        System.out.println("Villain   :"+itachi.getVillain());
        System.out.println("Partner   :"+itachi.getPartner());
        System.out.println("Ring      :"+itachi.getRings());
        System.out.println("Status    :"+itachi.getStatus());
        System.out.println("Sex       :"+itachi.getGender());
        System.out.println("Jutsu     :"+itachi.getJutsu());
        System.out.println("Abilities :"+itachi.getAbilities());
        
        System.out.println();
        Jugo jugo = new Jugo("Jugo", 12, "Kirigakure", "Itachi", "Left right finger:\"south\"; color yellow",
                                 "Killed by the Fourth Mizukage", "male", "Sage Mode, Sage Transformation, etc. ",
                                 "Sage Transformation");
        jugo.whoAreYou();
        System.out.println("Name      :"+jugo.getName());
        System.out.println("Appears   :"+jugo.getAppears());
        System.out.println("Villain   :"+jugo.getVillain());
        System.out.println("Partner   :"+jugo.getPartner());
        System.out.println("Ring      :"+jugo.getRings());
        System.out.println("Status    :"+jugo.getStatus());
        System.out.println("Sex       :"+jugo.getGender());
        System.out.println("Jutsu     :"+jugo.getJutsu());
        System.out.println("Abilities :"+jugo.getAbilities());
        
        System.out.println();
        Kakazu kakazu = new Kakazu("Kakazu", 16, "Takigakure", "Hidan", "Left middle finger:\"north\"; color dark green",
                                 "Killed by Kakashi Hatake", "male", "Sage Mode, Sage Transformation, etc. ",
                                 "Earth, fire, water, wind, etc");
        kakazu.whoAreYou();
        System.out.println("Name      :"+kakazu.getName());
        System.out.println("Appears   :"+kakazu.getAppears());
        System.out.println("Villain   :"+kakazu.getVillain());
        System.out.println("Partner   :"+kakazu.getPartner());
        System.out.println("Ring      :"+kakazu.getRings());
        System.out.println("Status    :"+kakazu.getStatus());
        System.out.println("Sex       :"+kakazu.getGender());
        System.out.println("Jutsu     :"+kakazu.getJutsu());
        System.out.println("Abilities :"+kakazu.getAbilities());
        
        System.out.println();
        KisameHoshigaki kisame = new KisameHoshigaki("Kisame Hoshigaki", 32, "Kirigakure", "Itachi", "Left right finger:\"south\"; color yellow",
                                 "Survives to next iteration", "male", "Sage Mode, Sage Transformation, etc. ",
                                 "water techniques specialist, etc.");
        kisame.whoAreYou();
        System.out.println("Name      :"+kisame.getName());
        System.out.println("Appears   :"+kisame.getAppears());
        System.out.println("Villain   :"+kisame.getVillain());
        System.out.println("Partner   :"+kisame.getPartner());
        System.out.println("Ring      :"+kisame.getRings());
        System.out.println("Status    :"+kisame.getStatus());
        System.out.println("Sex       :"+kisame.getGender());
        System.out.println("Jutsu     :"+kisame.getJutsu());
        System.out.println("Abilities :"+kisame.getAbilities());
        kisame.setUniqueTraits1("Can absorb chakra, Gills");
        kisame.uniqueTraits();
        
        System.out.println();
        Konan konan = new Konan("konan", 12, "Amegakure", "Nagato", "Right middle finger:\"white\";color white",
                                 "Left organisation", "female", "Sage Mode, Sage Transformation, etc. ",
                                 "paper techniques specialist, etc.");
        konan.whoAreYou();
        System.out.println("Name      :"+konan.getName());
        System.out.println("Appears   :"+konan.getAppears());
        System.out.println("Villain   :"+konan.getVillain());
        System.out.println("Partner   :"+konan.getPartner());
        System.out.println("Ring      :"+konan.getRings());
        System.out.println("Status    :"+konan.getStatus());
        System.out.println("Sex       :"+konan.getGender());
        System.out.println("Jutsu     :"+konan.getJutsu());
        System.out.println("Abilities :"+konan.getAbilities());
        
        System.out.println();
        ObitoUchiha obito = new ObitoUchiha("Obito Uchiha", 28, "Konohagakure", "Deidara", "Left thumb:\"jewel\",\"ball\";color : purple",
                                 "Survives to next iteration", "male", "Sage Mode, Sage Transformation, etc. ",
                                 "path techniques specialist, etc.");
        obito.whoAreYou();
        System.out.println("Name      :"+obito.getName());
        obito.setKnownAs("Tobi");
        obito.knownAs();
        System.out.println("Appears   :"+obito.getAppears());
        System.out.println("Villain   :"+obito.getVillain());
        System.out.println("Partner   :"+obito.getPartner());
        System.out.println("Ring      :"+obito.getRings());
        System.out.println("Status    :"+obito.getStatus());
        System.out.println("Sex       :"+obito.getGender());
        System.out.println("Jutsu     :"+obito.getJutsu());
        System.out.println("Abilities :"+obito.getAbilities());
        obito.setUniqueTraits2("Can absorb chakra");
        obito.uniqueTraits2();
        
        System.out.println();
        Orochimaru orochimaru = new Orochimaru("Orochimaru", 40, "Konohagakure", "Sasori", "Left little finger:\"sky\",\"void\";color slate blue",
                                 "Left organisation", "various", "Binding Snake Glare Spell, etc.",
                                 "Chakra and Physical Prowess, Body Modifications, etc.");
        orochimaru.whoAreYou();
        System.out.println("Name      :"+orochimaru.getName());
        System.out.println("Appears   :"+orochimaru.getAppears());
        System.out.println("Villain   :"+orochimaru.getVillain());
        System.out.println("Partner   :"+orochimaru.getPartner());
        System.out.println("Ring      :"+orochimaru.getRings());
        System.out.println("Status    :"+orochimaru.getStatus());
        System.out.println("Sex       :"+orochimaru.getGender());
        System.out.println("Jutsu     :"+orochimaru.getJutsu());
        System.out.println("Abilities :"+orochimaru.getAbilities());
        orochimaru.setUniqueTraits3("Can absorb chakra");
        orochimaru.uniqueTraits3();
        
        System.out.println();
        Sasori sasori = new Sasori("Sasori", 20, "Sunagakure", "Deidara, Orochimaru", "Left thumb:\"jewel\",\"ball\";color : purple",
                                 "Killed by Chiyo", "male", "Iron technique specialist, etc. ",
                                 "Puppet Mastery (Hiruko,Human Puppetry, Third Kazekage, Puppet Body), Intelligence");
        sasori.whoAreYou();
        System.out.println("Name      :"+sasori.getName());
        System.out.println("Appears   :"+sasori.getAppears());
        System.out.println("Villain   :"+sasori.getVillain());
        System.out.println("Partner   :"+sasori.getPartner());
        System.out.println("Ring      :"+sasori.getRings());
        System.out.println("Status    :"+sasori.getStatus());
        System.out.println("Sex       :"+sasori.getGender());
        System.out.println("Jutsu     :"+sasori.getJutsu());
        System.out.println("Abilities :"+sasori.getAbilities());
    }
    
}
