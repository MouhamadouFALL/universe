package com.siggidieuf.helloUniverse;

public class HelloUniverse {
    public static void main(String... args){
        // TP Fil Rouge - Sujet : Utiliser if et else
        String phraseIntro = "En %d, les planètes du système solaire était au nombre de: %d.";
        int nbPlanetes = 0;
        int annee = 2016;
        if (annee < 2006) {
            nbPlanetes = 9;
        }
        else {
            nbPlanetes = 8;
        }
        System.out.printf(phraseIntro, annee, nbPlanetes);



    }
}
