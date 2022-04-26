package me.andre.examenpoo.partida;

import me.andre.examenpoo.metodes.Metodes;
import me.andre.examenpoo.objectes.Jugador;

import java.util.ArrayList;

public class IniciPartida {
    // Metode de inici de la partida
    public static void iniciarPartida (ArrayList<Jugador> jugadors) {
        boolean partida = true;

        // Començarem fent un bucle que sera per a les "rondes".
        int ronda = 0;
        while(partida){
            System.out.println(" ");
            System.out.println("**********************");
            System.out.println("RONDA: " + ronda);

            // Iterarem tots els jugadors per a que cada un faci el seu tir.
            for(Jugador jugador : jugadors){
                // Fem un arraylist per a guardar els punts dels 3 dardos del jugador.
                ArrayList<Integer> puntsJug = new ArrayList<Integer>();
                int coordX = 0;
                int coordY = 0;
                int punts;

                // El jugador tirara 3 cops.
                for (int i = 0; i < 3; i++) {
                    coordX = Metodes.numeroRandom(0, 8);
                    coordY = Metodes.numeroRandom(0, 8);
                    punts = Metodes.calculPunts(coordX, coordY);
                    puntsJug.add(punts);
                }

                // Iterarem els punts dels 3 dards per a sumar a una variable que seran els punts totals.
                int puntsTotals = 0;
                for (int punt : puntsJug){
                    puntsTotals = puntsTotals + punt;
                }

                // Si els punts del jugador son menor a 0, el jugador no li conta aquesta ronda.
                if(jugador.getPunts() - puntsTotals < 0){
                    System.out.println("El jugador " + jugador.getNom() + " ha sobrepasat el minim, torna a tirar.");
                    continue;
                }

                // Li restem al jugador els punts que ha aconseguit.
                jugador.setPunts(jugador.getPunts() - puntsTotals);

                // Mostrarem els punts que ha conseguit el jugaor en aquesta ronda.
                System.out.print(jugador.getNom() + ": ");
                for (int punt : puntsJug){
                    System.out.print(punt + " ");
                }
                System.out.print("|| Punts obtinguts: " + puntsTotals +" || Punts actuals: " + jugador.getPunts());
                System.out.println(" ");

            }

            System.out.println("**********************");
            System.out.println(" ");
            ronda++;

            // Ara mirarem si algun dels dos jugadors ha guanyat en aquesta ronda.
            for(Jugador jugador : jugadors){
                if (jugador.getPunts() == 0){
                    System.out.println("El jugador " + jugador.getNom() + " te " + jugador.getPunts() + " punts!. Ha guanyat!");
                    partida = false;
                    return;
                }
            }

        }

    }



}
