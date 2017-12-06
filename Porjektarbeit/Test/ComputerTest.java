import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void isStatus() throws Exception {
        Computer comm = new Computer ();
        assertFalse(isStatus());
    }

    @Test
    public void setStatus() throws Exception {
    }

    @Test
    public void getTextverarbeitungspro() throws Exception {
         String co = new String ("text");
         assertEquals("text", text.getTextverarbeitungspro());
    }

    @Test
    public void drucken() throws Exception {
    }

}