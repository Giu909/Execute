import java.util.ArrayList;

public class CC {
    ArrayList<String> mov;
    double saldo;
    String[] movi;
    int i = 0;

    public CC() {
        this.mov = new ArrayList<>();
        this.saldo = 0;
        this.movi = new String[5];
    }

    public void getSaldo() {
        System.out.println("Il saldo del conto è " + saldo);
    }

    public void setSaldo(double saldo, boolean add) {
        String toRet;
        if (add) {
            this.saldo += saldo;
            toRet = "Aggiunta al conto di euro " + saldo;
            mov.add(toRet);
            movimentiArray(toRet);
        }
        else {
            this.saldo -= saldo;
            toRet = "Prelievo di euro " + saldo;
            mov.add(toRet);
            movimentiArray(toRet);
        }
    }

    public void movimenti () {
        mov.forEach(x -> System.out.println("Movimento: " + x));
        System.out.println("Saldo Totale " + this.saldo);
    }

    public void movimentiArray (String movimento) {
        movi[i] = movimento;
        i++;
        if (i >= 5) i = 0;
    }

    public void printArray () {
        for (String s : movi) {
            System.out.println("Movimento Array: " + s);
        }
    }

    public void toCall () {
        CC conto = new CC();
        conto.setSaldo(100, true);
        conto.setSaldo(55, false);
        conto.setSaldo(18, true);
        conto.setSaldo(55, false);
        conto.setSaldo(89, true);
        conto.setSaldo(55, false);
        conto.setSaldo(100, true);
        conto.setSaldo(55, false);
        conto.setSaldo(18, true);
        conto.setSaldo(55, false);
        conto.setSaldo(89, true);
        conto.setSaldo(55, false);
        conto.getSaldo();
        conto.movimenti();
        conto.printArray();
    }
}
