import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass LocalNumber = new MainClass();
        @Test
        public void testGetLocalNumber(){
            Assert.assertTrue( "LocalNumber is not equal 14", LocalNumber.getLocalNumber() == 14 );
        }

}
