package org.prog.session13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPhone {
    Phone phone = new Phone();

    @Test
    public void passingMyTest() {
        Phone phone  =  new Phone();
        phone.color = "black";
        Assertions.assertEquals("black", phone.color);
    }
    @Test
    public void failingPhoneTest() {

        Phone phone = new Phone();
        phone.color = "yellow";
        Assertions.assertEquals("black",phone.color);

     }
}
