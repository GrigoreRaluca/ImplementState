public class InCursDePreparare implements Stare{
    private static InCursDePreparare instance=null;
    private InCursDePreparare()
    {

    }
    @Override
    public void updateStare(ComandaMancare comandaMancare) {
        System.out.println("IN CURS DE PREPARARE");

    }
    public static synchronized InCursDePreparare getInstance(){
        if(instance==null)
            instance=new InCursDePreparare();
        return instance;
    }
}
