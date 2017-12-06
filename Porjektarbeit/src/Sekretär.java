public class Sekretär {
    //Neues Objekt von Computer wird erstellt.
    Computer computer = new Computer();
    //Neues Objekt von Drucker wird erstellt
    Drucker drucker = new Drucker();
    //Neues Objjekt von Stift wird erstellt
    Stift stift = new Stift();
    //Neues Objekt von Stempel wird erstellt.
    Stempel stempel = new Stempel();
    //Neues Objekt von Briefmarkenautomat wird erstellt.
    Briefmarkenautomat briefmarkenautomat = new Briefmarkenautomat();
    //Neues Objekt von briefkasten wird erstellt
    Briefkasten briefkasten = new Briefkasten();
    //Neues Datenfeld von Typ Dokument wird erstellt
    Dokument doku;

    //Versendet den Text der angegeben wurde.
    public void schreibenVersenden(String text){


        //Computer muss angeschaltet werden.
        computer.setStatus(true);
        //Das Textverarbeitungsprogramm muss geöffnet werden.
        Textverarbeitungsprogramm textverarbeitungsprog = computer.getTextverarbeitungspro();
        textverarbeitungsprog.öffnen();
        //Mit dem Textverarbeitungsprogramm muss das Dokument erstellt werden
        doku = textverarbeitungsprog.getDokument(text);
        //Drucker muss angeschaltet werden
        drucker.setState(true);
        //Drucker muss konfiguriert werden
        drucker.konfigurieren();
        //Papier muss in den Drucker gelegt werden
        drucker.papierNachfuellen();
        //Das Dokument muss gedruckt werden
        computer.drucken(doku);
        //Der Drucker sollte ausgeschaltet werden
        drucker.setState(false);
        //Der Computer sollte ausgeschaltet werden
        computer.setStatus(false);
        //Das Dokument muss mit dem Stift unterschrieben werden
        stift.unterschreiben(doku);
        //Das Dokument muss mit dem Stempel gestempelt werden
        stempel.stempeln(doku);
        //Das Dokument muss mit Hilfe des Briefmarkenautomaten frankiert werden
        briefmarkenautomat.briefmarkeBezahlen(doku, 2);
        //Das Dokument muss schließlich in den Briefkasten geworfen werden.
        briefkasten.briefEinwerfen(doku);
    }

}
