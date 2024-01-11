import it.epicode.be.dipendente.Dipartimento;
import it.epicode.be.dipendente.Dipendente;
import it.epicode.be.dipendente.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio1 = new Dipendente("OP1", Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("OP2", Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente("IM1", 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new Dipendente("DI1", 2000, 50, Livello.DIRIGENTE, Dipartimento.VENDITE);

        Dipendente[] dipendenti = {operaio1, operaio2, impiegato, dirigente};

        operaio1.promuovi();

        double totaleStipendi = 0;
        for (Dipendente d : dipendenti) {
            totaleStipendi += Dipendente.calcolaPaga(d, 5);
            d.stampaDatiDipendente();
        }
        System.out.println("Totale stipendi da pagare: " + totaleStipendi);
    }
}