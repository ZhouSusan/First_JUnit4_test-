import org.example.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void getName() throws Exception {
        HelloWorld susan = new HelloWorld("Susan");
        assertEquals("Susan",susan.getName());

        HelloWorld izzy = new HelloWorld("Izzy");
        assertEquals("Susan",izzy.getName());
    }
}