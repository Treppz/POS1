public class Briefmarkenautomat {
    // Geld wir bezahlt
    public void briefmarkeBezahlen(Dokument dokument, int geld)
    {
        dokument.setBriefmarkeBezahlt(true);
        System.out.println("Briefmarke wurde bezahlt.");
    }
}
