package mikk;

import java.util.ArrayList;
import java.util.List;

// Definizione della classe Piatto
class Piatto {
    String ingredienti;
    double prezzo;
    String chef;

    // Costruttore di Piatto
    public Piatto(String ingredienti, double prezzo, String chef) {
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
        this.chef = chef;
    }

    // Getter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }
}

// Definizione della classe Menu
class Menu {
    List<Piatto> piatti = new ArrayList<>();

    // Metodo per aggiungere un piatto al menu
    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    // Metodo per ottenere la lista dei piatti
    public List<Piatto> getPiatti() {
        return piatti;
    }
}

// Definizione della classe Ordinazione
class Ordinazione {
    List<Piatto> piattiOrdinati = new ArrayList<>();

    // Metodo per aggiungere un piatto alla ordinazione
    public void aggiungiPiatto(Piatto piatto) {
        piattiOrdinati.add(piatto);
    }

    // Metodo per calcolare il totale dell'ordinazione
    public double calcolaTotale() {
        double totale = 0;
        for (Piatto piatto : piattiOrdinati) {
            totale += piatto.getPrezzo();
        }
        return totale;
    }
}
