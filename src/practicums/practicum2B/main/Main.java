package practicums.practicum2B.main;

import practicums.practicum2B.voetbalclub.Voetbalclub;

public class Main {

    public static void main(String[] args) {

        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPuntenOptellen());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeldOptellen());
        System.out.println();
        System.out.println(ajx);
        System.out.println(feij);


    }
}
