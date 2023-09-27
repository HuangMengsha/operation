import org.junit.jupiter.api.Test;
import sun.applet.Main;

public class MainTest {

    @Test
    public void testMain(){

        Arithmetic.main(new String[]{"-r","10","-n","5"});
    }

}
