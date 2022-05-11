public class ComandaMancare {
    int nr_comanda;
    Stare stare;

    public ComandaMancare(int nr_comanda, Stare stare) {
        this.nr_comanda = nr_comanda;
        this.stare = stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
}
    public void updateState()
    {
        stare.updateStare(this);
    }
}
