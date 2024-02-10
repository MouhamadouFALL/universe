package com.siggidieuf.helloUniverse;

public class Exchane {
    public static void main(String[] args) {
        int eurosRond = 1500;
        float taux = 1.22f;
        float resultat;

        resultat = taux*eurosRond;
        System.out.println("Montant en Dollars : ");
        System.out.println(resultat);

        //System.out.println("Entrer le montant à changer : ");

        // Arithmetique
        int x = -3 + 5 - 2;
        System.out.println(x);

        // Les opérateurs d'incrémentation(++), décrémentation(--)
        int a = 3;
        int b;
        //b = ++a; // evaluation à droite puis affectation dans la var b
        //System.out.println(b); // b ==> 4
        b = a++; // affectation de la var b puis evaluation à droite
        System.out.println(b); // b ==> 3
    }


}
