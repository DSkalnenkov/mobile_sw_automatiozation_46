import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass classNumber = new MainClass();
        @Test
        public void testGetClassNumber(){
            Assert.assertTrue( "class_number is not greater than 45. It is: " + classNumber.getClassNumber(), classNumber.getClassNumber() > 45 );
        }

}
