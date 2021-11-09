import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass classString = new MainClass();
        @Test
        public void testGetClassString(){
            Assert.assertTrue( "classString doesn't contain 'Hello' or 'hello' ",
                    classString.getClassString().contains("Hello") |
                    classString.getClassString().contains("hello") );
        }
}
