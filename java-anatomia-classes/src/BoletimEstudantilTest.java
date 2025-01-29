import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.aluizio.primeirasemana.BoletimEstudantil;

public class BoletimEstudantilTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testReprovado() {
        BoletimEstudantil.main(new String[] {"5"});
        assertEquals("REPROVADO\n", outContent.toString());
    }

    @Test
    public void testProvaMinerva() {
        BoletimEstudantil.main(new String[] {"6"});
        assertEquals("PROVA MINERVA\n", outContent.toString());
    }

    @Test
    public void testAprovado() {
        BoletimEstudantil.main(new String[] {"7"});
        assertEquals("APROVADO\n", outContent.toString());
    }
}