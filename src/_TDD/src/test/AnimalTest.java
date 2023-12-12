package _TDD.src.test;

import _TDD.src.main.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {


    @Test
    public void hasName() {
// Add an Animal Class which holds just the name of the animal. The name is required

       // given <- base
        String name = "Tiger";
        String name_2 = "Bear";


//        when <- input
//        I create a new instance
        Animal tiger = new Animal(name);
        Animal bear = new Animal(name_2);

//        then <- expected behaviour/result
//        it should have the name
        assertEquals(tiger.getName(), name);
        assertEquals(bear.getName(), name_2);
    }

    public AnimalTest() {
    }
}
