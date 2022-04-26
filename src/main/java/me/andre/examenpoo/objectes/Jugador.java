package me.andre.examenpoo.objectes;

public class Jugador {
    private String nom;
    private int punts;

    /**
     * Constructor del objecte Jugador
     * @param nom
     */
    public Jugador(String nom) {
        this.nom = nom;
        this.punts = 501;
    }

    // Getters dels atributs
    public String getNom() {
        return nom;
    }
    public int getPunts() {
        return punts;
    }

    // Setters dels atributs.
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPunts(int punts) {
        this.punts = punts;
    }
}
