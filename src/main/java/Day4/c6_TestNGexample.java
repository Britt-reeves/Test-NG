package Day4;
import org.testng.annotations.*;

import org.testng.annotations.*;

public class c6_TestNGexample {




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
//even if this is the first test case I want this to be ran last
        @Test(priority = 3)
        public void TC1_1(){
            System.out.println("Test 1 is running");
        }
        @Test
        public void TC2_2(){
            System.out.println("Test 2 is running");
        }
        @Test
        public void TC3_Test(){
            System.out.println("Test 3 is running");
        }
// look up assertion in selenium


    }

