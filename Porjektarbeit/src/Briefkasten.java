public class Briefkasten {
    //Brief wird eingeworfen
    public void briefEinwerfen(Dokument dokument)
    {
        dokument.setEingeworfen(true);
        System.out.println("Brief wurde eingeworfen.");
    }
}
