public class Textverarbeitungsprogramm {

    //Datenfeld von Typ dokumennt wird erstellt
    private Dokument dokument = new Dokument();
    //Datenfeld von Typ boolean wird erstellt
    private boolean start;

    //Programm wird geöffnet
    public void öffnen()
    {

        start = true;
    }

    //programm wird geschlossen
    public void schließen()
    {
        start = false;
    }
    // DAs Dokument bekommt seinen Text
    public Dokument getDokument(String text) {
        dokument.setText(text);
        return dokument;
    }
}
