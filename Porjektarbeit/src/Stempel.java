public class Stempel {
    //Dokument bekommt einen Stempel
    public void stempeln(Dokument dokument){
        dokument.setStempel(true);
        System.out.println("Dokument wurde gestempelt.");
    }
}
