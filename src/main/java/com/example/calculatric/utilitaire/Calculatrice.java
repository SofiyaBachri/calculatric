package com.example.calculatric.utilitaire;
import jakarta.ws.rs.PathParam;
public class maths {
    public String add(int a, int b) {
        int resultat = a + b;
        return ("le resultat de l'addition est " + resultat);
    }

    public String sous(int a, int b) {
        int resultat = a - b;
        return ("le resultat de la soustraction est" + resultat);
    }

    public String multi(int a, int b) {
        int resultat = a * b;
        return ("le resultat de la multiplication est" + resultat);
    }

    public String fact(int a){
        int result = 1;
        for( int i=1; i <= a; i++){
            result *= i;
        }
        return ("le resultat de la division est" + result);
    }
}
