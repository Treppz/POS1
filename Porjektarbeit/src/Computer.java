public class Computer {
    //Neues Datenfeld von Typ boolean wird erstellt
    private boolean status = false;
    //Neues Datenfeld von Typ Textverarbeitungsprogramm wird erstellt
    private Textverarbeitungsprogramm Textverarbeitungspro;
    //Neues Datenfeld von Typ Drucker wird erstellt
    private Drucker drucker;

    //Konstrukter wird erstellt
    public Computer() {
        Textverarbeitungspro = new Textverarbeitungsprogramm();
        drucker = new Drucker();
    }
    //Geter Methode von Status
    public boolean isStatus() {

        return status;
    }
    //Seter Methode von Status
    public void setStatus(boolean status) {

        this.status = status;
    }
    //Geter Metode von Textverarbeitungpro
    public Textverarbeitungsprogramm getTextverarbeitungspro() {

        return Textverarbeitungspro;
    }

    //Dokument wird ausgedruckt
    public void drucken(Dokument dokument) {
        if(drucker.isState())
        {
            System.out.println("Dokument wird gedruckt");
        }
        else
        {
            drucker.setState(true);

            if(drucker.isState())
            {
                System.out.println("Dokument wird gedruckt");
            }
        }
    }

}
