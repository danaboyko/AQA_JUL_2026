package org.prog.session13;

import org.junit.jupiter.api.*;

public class Phone {

    @Test
    public void passingMyTest() {

        String phone  = "black";
        Assertions.assertEquals("black", phone, "Phone must be black");
    }
    @Test
    public void failingRedPhoneTest(){
        String phone = "red";
        Assertions.assertEquals("black", phone, "Phone must be only black");
    }
    @Test
    public void failingYellowPhoneTest(){
        String phone = "yellow";
        Assertions.assertEquals("black", phone, "Phone must be only black");

    }
    }


