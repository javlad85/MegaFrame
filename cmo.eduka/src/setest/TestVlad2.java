package setest;

import org.testng.annotations.Test;

public class TestVlad2 {

    @Test
    void setup(){
        System.out.println("test1");;
    }

    @Test
    void login(){
        System.out.println("test2");
    }

    void tearDown(){
        System.out.println("closing");
    }

}
