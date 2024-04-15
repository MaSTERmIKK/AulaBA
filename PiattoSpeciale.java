package Jsva;

public class PiattoSpeciale {
    private double prezzoBase = 1.0; // Prezzo fisso base
    private double prezzoTotale; // Prezzo totale del piatto
    private String[] ingredientiPrivati = { "IngredientePrivato1", "IngredientePrivato2" }; // Array di ingredienti
                                                                                            // privati
    public String[] ingredientiPubblici; // Array di ingredienti pubblici selezionabili

    // Costruttore della classe
    public PiattoSpeciale(String[] ingredientiPubblici) {
        this.ingredientiPubblici = ingredientiPubblici;
        this.prezzoTotale = prezzoBase; // Imposta il prezzo base inizialmente
        calcolaPrezzoTotale();
    }

    // Metodo privato per calcolare il prezzo totale in base agli ingredienti
    // selezionati
    private void calcolaPrezzoTotale() {
        for (String ingrediente : ingredientiPubblici) {
            if (!(ingrediente.equals("IngredientePubblico1"))) {
                prezzoTotale += 2.0; // Prezzo per IngredientePubblico1
            } else if (ingrediente.equals("IngredientePubblico2")) {
                prezzoTotale += 3.0; // Prezzo per IngredientePubblico2
            }
        }
    }

    // Metodo pubblico per ottenere il prezzo totale
    public double getPrezzoTotale() {
        return prezzoTotale;
    }
}
