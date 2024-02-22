package com.siggidieuf.helloUniverse;

public class HelloUniverse {
    public static void main(String... args){
        // TP Fil Rouge - Sujet : Utiliser if et else
        // String phraseIntro = "En %d, les planètes du système solaire était au nombre de: %d.";
//        int nbPlanetes = 0;
//        int annee = 2016;
//        if (annee < 2006) {
//            nbPlanetes = 9;
//        } else {
//            nbPlanetes = 8;
//        }
//        System.out.printf(phraseIntro, annee, nbPlanetes);

        // TP Fil Rouge - Sujet : Utiliser if, else if et else

        String msgErreur = "Le programme ne peut pas fournir de résultat pour l'année %d";
        String msg1700 = "L'année est inférieure à 1700 alors le nombre de planètes est de %d";
        String msg1800 = "L'année est inférieure à 1800 alors le nombre de planètes est de %d";
        String phraseIntro = "En %d, les planètes du système solaire était au nombre de: %d.";
        int nbPlanetes = 0;
        int annee = 2016;
//        if (annee >= 1600 && annee <= 2020){
//            if (annee < 1700) {
//                nbPlanetes = 7;
//                System.out.printf(msg1700, nbPlanetes);
//            } else if (annee < 1800 && annee >= 1700) {
//                nbPlanetes = 8;
//                System.out.printf(msg1800, nbPlanetes);
//            } else if (annee >= 1800 && annee <= 2006) {
//                nbPlanetes = 9;
//                System.out.printf(phraseIntro, annee, nbPlanetes);
//            } else {
//                nbPlanetes = 8;
//                System.out.printf(phraseIntro, annee, nbPlanetes);
//            }
//        } else {
//            System.out.printf(msgErreur, annee);
//        }

        // Solution
        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        if (annee<1600 || annee>2020){
            System.out.printf("Le programme ne peut pas fournir de résultat pour %d", annee);
        }
        else {
            if (annee < 1700) {
                nbPlanetes = 7;
            }
            else if (annee < 1800) {
                nbPlanetes = 8;
            }
            else if (annee < 2006) {
                nbPlanetes = 9;
            } else {
                nbPlanetes = 8;
            }
            System.out.printf(phraseIntroduction, annee, nbPlanetes);
        }
    }
}
