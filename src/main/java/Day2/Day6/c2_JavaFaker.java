package Day2.Day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c2_JavaFaker {

    @Test
    public void TC1_JavaFaker(){
        //need to be able to use library you need to create instance object from the class

        Faker  faker=new Faker();
        System.out.println("Faker name. faker full name="+faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().state());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().character());
    }


}
