import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.hello();
        assertEquals("hello world", result);
    }
}
