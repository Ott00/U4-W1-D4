package it.epicode.be.dipendente;

public enum Livello {
    OPERAIO(1),
    IMPIEGATO(1.2),
    QUADRO(1.5),
    DIRIGENTE(2);

    private double rapporto;

    Livello(double rapporto) {
        this.rapporto = rapporto;
    }
    public double getRapporto() {
        return rapporto;
    }
}
