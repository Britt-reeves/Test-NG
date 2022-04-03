package utilities;
//      create an utility method called wait
//    //static method   so i can call by using class name
//    //return type void
//    //parameter should be int second
//    //goal of the method :
//    //handle thread.sleep with try catch  multiple with second parameter
public class BrowserUtils {

    public static void wait(int second) {//this is the parameter. whenever you add second on 10 you implement it on line 12
        try{
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
            //we created a method and a try catch block method
            //it works by if there is something wrong in the code it will be caught
            //if we dont use it, it will make the code break because of an exception
            //
        }


    }
}
