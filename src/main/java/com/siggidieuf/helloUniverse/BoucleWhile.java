package com.siggidieuf.helloUniverse;

public class BoucleWhile {

    public static void main(String[] args) {

        /*boolean estContinu = true;
        while (estContinu) {
            System.out.println("Test Boucle While");
            estContinu = false;
        }*/

        // Avec do while
        /*boolean estContinu = false;
        do {
            System.out.println("Test Boucle do While");
        } while (estContinu);*/


        int nbPlanetes = 7;
        while (nbPlanetes <= 9) {
            switch (nbPlanetes) {
                case 7:
                    System.out.printf("\nOn sait qu'au 16ème siècle, seules %d planètes avaient été découvertes", nbPlanetes);
                    break;
                case 8:
                    System.out.printf("\nOn sait que le nombre de planètes est passé de 7 à %d au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006", nbPlanetes);
                    break;
                case 9:
                    System.out.printf("\nOn sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8", nbPlanetes);
                    break;
                default:
                    System.out.printf("\nLe programme ne peut pas fournir de résultat pour %d", nbPlanetes);
                    break;
            }
            nbPlanetes++;
        }
    }
}
