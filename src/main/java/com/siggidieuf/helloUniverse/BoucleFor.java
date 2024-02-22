package com.siggidieuf.helloUniverse;

public class BoucleFor {

    public static void main(String[] args) {

        // Boucle Infini
        //for (; ;) {
        //    System.out.println("Ceci indique un boucle infini");
        //}

        for (int nbPlanetes = 7; nbPlanetes <= 9; nbPlanetes++) {
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
        }

    }
}
