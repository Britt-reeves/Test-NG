package Day4;
//Before class, it its used before class not before method. they are different
import org.testng.annotations.*;

public class c5_TestNGpractice {
    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running");

    }
    @AfterClass
    public void setupAfterclass(){
        System.out.println("After class is running");

    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("after method is running");
    }

    @Test
    public void TC1_Test(){
        System.out.println("Test 1 is running");
    }
    @Test
    public void TC2_Test(){
        System.out.println("Test 2 is running");
    }
    @Test
    public void TC3_Test(){
        System.out.println("Test 3 is running");
    }


}
