package me.andre.examenpoo.metodes;

public class Metodes {
    /**
     * Metode per a generar un numero aleatori entre dos valors pasats.
     * @param min
     * @param max
     * @return
     */
    public static int numeroRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Metode per a calcular els punts que te el jugador.
     * @param coordX
     * @param coordY
     * @return
     */
    public static int calculPunts(int coordX, int coordY){
        // Si una de les dos es 0 o 8 vol dir que es 0 punts.
        if ((coordX == 0 || coordX == 8) || (coordY == 0 || coordY == 8)) {
            return 0;
        }
        // Si una de les dos es 1 o 7 vol dir que es 1 punts.
        else if ((coordX == 1 || coordX == 7) || (coordY == 1 || coordY == 7)) {
            return 1;
        }
        // Si una de les dos es 2 o 6 vol dir que es 2 punts.
        else if ((coordX == 2 || coordX == 6) || (coordY == 2 || coordY == 6)) {
            return 2;
        }
        // Si una de les dos es 3 o 5 vol dir que es 5 punts.
        else if ((coordX == 3 || coordX == 5) || (coordY == 3 || coordY == 5)) {
            return 5;
        }
        // Si les dues son 4 vol dir que es 10 punts.
        else if (coordX == 4 && coordY == 4) {
            return 10;
        }

        // En cas que doni algun error o les coordenades no estiguin a dins de la diana donara 0.
        return 0;
    }
}
