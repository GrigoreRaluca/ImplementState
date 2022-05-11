public class ComandaPlasata implements Stare{
    private static ComandaPlasata instance=null;
    private ComandaPlasata(){}
    @Override
    public void updateStare(ComandaMancare comandaMancare) {
        System.out.println("COMANDA PLASATA");
        comandaMancare.setStare(InCursDePreparare.getInstance());
    }
    public static synchronized ComandaPlasata getInstance(){
        if(instance==null)
            instance=new ComandaPlasata();
        return instance;
    }
}
