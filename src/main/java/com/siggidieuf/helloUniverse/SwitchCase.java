package com.siggidieuf.helloUniverse;

public class SwitchCase {

    public static void main(String[] args) {

        int nbPlanetes = 7;
        switch (nbPlanetes) {
            case 7:
                System.out.printf("On sait qu'au 16ème siècle, seules %d planètes avaient été découvertes", nbPlanetes);
                break;
            case 8:
                System.out.printf("On sait que le nombre de planètes est passé de 7 à %d au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006", nbPlanetes);
                break;
            case 9:
                System.out.printf("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8", nbPlanetes);
                break;
            default:
                System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
                break;
        }

        System.out.println("\n--------------------------------------------------");
        String mois = "Mai";
        switch (mois) {
            case "Janvier":
            case "Février":
            case "Mars":
                System.out.println("C'est l'hiver.");
                break;
            case "Avril":
            case "Mai":
            case "Juin":
                System.out.println("C'est le printemps.");
                break;
            case "Juillet":
            case "Aout":
            case "Septembre":
                System.out.println("C'est l'été.");
                break;
            case "Octobre":
            case "Novembre":
            case "Décembre" :
                System.out.println("C'est l'automne");
                break;
        }
    }
}
