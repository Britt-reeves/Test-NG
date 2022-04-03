package Day5;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class c1_TestNG {
    @BeforeClass
    public void setupClass(){
        System.out.println("before class is running ");
    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After class is running ");
    }
    @Test(priority = 3,dependsOnMethods = "TC3_test3")
    public void TC1_test1(){
        System.out.println("Test 1 is running");
    }
    @Test
    public void TC3_test3(){
        System.out.println("Test 3 is running");
        String actualWord="BMW";
        String excpectedwod="Honda";
        Assert.assertEquals(actualWord,excpectedwod);
        System.out.println("continue test");
    }
    @Test
    public void TC2_test2(){
        System.out.println("Test 2 is running");
        String str="USA";
        String str2="USA";
        Assert.assertTrue(str.equals(str2));
    }
  // @Ignore





}
