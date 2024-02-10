package com.siggidieuf.helloUniverse;

public class HelloUniverse {
    public static void main(String... args){
        int nbPlanetes = 8;
        System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nbPlanetes);
        nbPlanetes++;
        System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + nbPlanetes);

        // formattage de chaînes de caractères
        int age = 29;
        System.out.printf("Mon age est %d, Oui je suis jeune", age);


    }
}
