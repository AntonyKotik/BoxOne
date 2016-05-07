import org.junit.Test;

        import static org.junit.Assert.*;

/**
 * Created by Kotik on 25.11.2015.
 */
public class mainTest {


    @Test
    public void testNAT() throws Exception {
        int n =5;
        assertEquals(main.Nat(n) , true);

    }

    @Test
    public void testRef() throws Exception {
        int n = 1234;
        assertEquals(main.ref(n), 4321);
    }
    @Test
    public void testSimple() throws Exception {
        int n =1000;
        assertEquals(main.Simple(n) , 56);

    }
}