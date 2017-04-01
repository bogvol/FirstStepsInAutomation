import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Kengoroo on 16.11.2015.
 */
public class ParameterizedTest1 {
    @Test
    @Parameters("myName")
    public void parameterTest(String myName){
        System.out.println("Parametrized value is : " + myName);
    }
}