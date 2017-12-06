public class Drucker {
    //Datenfeld von Typ boolean wird erstellt
    private boolean state=false;


    //Geter Methode von state
    public boolean isState() {

        return state;
    }
    //Seter Methode von State
    public void setState(boolean state) {
        this.state = state;
    }
    //Drucker wird konfiguriert
    public void konfigurieren(){

        System.out.println("Drucker wurde konfiguriert.");
    }
    //Papier vom Drucker wird nachgefüllt
    public void papierNachfuellen() {

        System.out.println("Papier wurde nachgefüllt.");
    }
}


