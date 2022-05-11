public class Main {

    public static void main(String[] args) {
        Stare s=ComandaPlasata.getInstance();
        ComandaMancare cm=new ComandaMancare(1,s);
        cm.updateState();
        cm.updateState();


    }
}
