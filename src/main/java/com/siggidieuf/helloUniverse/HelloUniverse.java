package com.siggidieuf.helloUniverse;

public class HelloUniverse {
    public static void main(String... args){
        //int nbPlanetes = 8;
        //System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nbPlanetes);
        //nbPlanetes++;
        //System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + nbPlanetes);

        // formattage de chaînes de caractères
        int age = 29;
        System.out.printf("Mon age est %d, Oui je suis jeune", age);

        if (age > 30 )
            System.out.println("Oui, je fais plus jeune.");

        int ageduCapitaine = 48;
        if (ageduCapitaine > age){
            System.out.println("L'age du capitaine est: "+ageduCapitaine);
            System.out.println("Bonjour mon capitaine.");
        }

        // TP Fil Rouge - Sujet : Affichage conditionnel - Première instruction conditionnelle
        String phraseIntro = "En %d, les planètes du système solaire était au nombre de: %d.";
        int nbPlanetes = 0;
        int annee = 2016;
        if (annee < 2006){
            nbPlanetes = 9;
        }
        if (annee >= 2006){
            nbPlanetes = 8;
        }
        System.out.printf(phraseIntro, annee, nbPlanetes);



    }
}
