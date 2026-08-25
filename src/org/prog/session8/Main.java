package org.prog.session8;

//TODO: interface IPhone
// Apple and Android implement IPhone
// IPhone must: unlock phone. Android: with fingerprint, Apple: with faceId
// HomeWork must have method that accepts IPhone and unlocks it

public class Main {
    public static void main (String[]args) {
        IPhone iPhone = new IPhone();
        Android android = new Android();
        unlock(iPhone);
        unlock(android);
    }
        public static void unlock (Phone phone){
            phone.unlock();
        }
    }

