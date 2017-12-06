public class Dokument {
    //Datenfeld von Typ String wird erstellt
    private String text;
    //Datenfeld von Typ boolean wird erstellt
    private boolean unterschrift = false;
    //Datenfeld von Typ stempel wird erstellt
    private boolean stempel = false;
    //Datenffeld von Typ boolean wird erstellt
    private boolean bezahlt = false;
    //Datenfeld von Typ boolean wird erstellt.
    private boolean eingeworfen = false;

    //Seter Methode von text
    public void setText(String text){

        this.text = text;
    }

    //Seter Methode von Unterschrift
    public void setUnterschrift(boolean unterschrift) {

        this.unterschrift = unterschrift;
    }

    //Seter Methode von Stempel
    public void setStempel(boolean stempel){

        this.stempel = stempel;
    }

    //Seter Mehtode von bezahlt
    public void setBriefmarkeBezahlt(boolean bezahlt){

        this.bezahlt = bezahlt;
    }

    //Seter Methode von eingeworfen
    public void setEingeworfen(boolean eingeworfen){

        this.bezahlt = bezahlt;
    }
}
