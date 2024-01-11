package it.epicode.be.dipendente;


public class Dipendente {
    private static double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    //Constructor
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    //Method
    public void stampaDatiDipendente() {
        System.out.printf("id:%s; stipendio: %.2f; importo orario straordinario %.2f; livello %s; dipartimento %s; \n",
                this.matricola, this.stipendio, this.importoOrarioStraordinario, this.livello, this.dipartimento);
    }

    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.stipendio = stipendioBase * Livello.IMPIEGATO.getRapporto();
                return this.livello = Livello.IMPIEGATO;
            case IMPIEGATO:
                this.stipendio = stipendioBase * Livello.QUADRO.getRapporto();
                return this.livello = Livello.QUADRO;
            case QUADRO:
                this.stipendio = stipendioBase * Livello.DIRIGENTE.getRapporto();
                return this.livello = Livello.DIRIGENTE;
            default:
                System.out.println("Un dirigente non può essere promosso");
                return this.livello;
        }
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    public static double calcolaPaga(Dipendente dipendente, double oreStraordinario) {
        return dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraordinario);
    }


    //Setters
    public void setImportoOrarioStraordinario(int importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //Getters
    public double getStipendioBase() {
        return stipendioBase;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}
