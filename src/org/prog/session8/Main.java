package org.prog.session8;

//TODO: interface IPhone
// Apple and Android implement IPhone
// IPhone must: unlock phone. Android: with fingerprint, Apple: with faceId
// HomeWork must have method that accepts IPhone and unlocks it

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IPhone iPhones1 = new IPhone();
        IPhone iPhones2 = new IPhone();
        IPhone iPhones3 = new IPhone();
        IPhone iPhones4 = new IPhone();
        Android android1 = new Android();
        Android android2 = new Android();
        Android android3 = new Android();
        Android android4 = new Android();

//        iPhones1.color = "white";
//        System.out.println("IPhone1" + " " + iPhones1.color);
//        iPhones2.color = "white";
//        System.out.println("IPhone2" + " " + iPhones2.color);
//        iPhones3.color = "gold";
//        System.out.println("IPhone3" + " " + iPhones3.color);
//        iPhones4.color = null;
//        android1.color = "green";
//        android2.color = "green";
//        android3.color = "black";
//        android4.color = null;
//        try {
//            unlock(android4);
//            unlock(iPhones4);
//        } catch (MyExc e) {
//            System.out.println("Exception" + " " + e.getMessage());
//        }
//        unlock(iPhones1);
//        unlock(iPhones2);
//        unlock(iPhones3);
//        unlock(android1);
//        unlock(android2);
//        unlock(android3);
//
//        System.out.println(android1.equals(iPhones1));
//        System.out.println(android1.equals(android2));
//        System.out.println(iPhones1.equals(iPhones2));
//        System.out.println(iPhones2.equals(iPhones3));
//        System.out.println(android2.equals(android3));
//        System.out.println(android1.hashCode());
//        System.out.println(android2.hashCode());
//        System.out.println(android3.hashCode());
//        System.out.println(iPhones1.hashCode());
//        System.out.println(iPhones2.hashCode());
//        System.out.println(iPhones3.hashCode());


        Map < String, Android> ourPhones  = new HashMap<>();
        ourPhones.put("android1", new Android());
        ourPhones.get("android1").number = "05015111111";
        ourPhones.get("android1").name = "Anna";
        System.out.println(ourPhones.get("android1").number);
        System.out.println(ourPhones.get("android1").name);
        ourPhones.put("android2", new Android());
        ourPhones.get("android2").number = "0671512222";
        ourPhones.get("android2").name = "Ira";
        System.out.println(ourPhones.get("android2").number);
        System.out.println(ourPhones.get("android2").name);
        ourPhones.put("android3", new Android());
        ourPhones.get("android3").number = "0501513333";
        ourPhones.get("android3").name = "Vira";
        System.out.println(ourPhones.get("android3").number);
        System.out.println(ourPhones.get("android3").name);

        Map < String, IPhone> ourApples = new HashMap<>();
        ourApples.put("iPhone1", new IPhone ());
        ourApples.get("iPhone1").number = "0990007777";
        ourApples.get("iPhone1").name = "Petro";
        System.out.println(ourApples.get("iPhone1").number);
        System.out.println(ourApples.get("iPhone1").name);
        ourApples.put("iPhone2", new IPhone ());
        ourApples.get("iPhone2").number = "0990006666";
        ourApples.get("iPhone2").name = "Ivan";
        System.out.println(ourApples.get("iPhone1").number);
        System.out.println(ourApples.get("iPhone1").name);
        ourApples.put("iPhone3", new IPhone ());
        ourApples.get("iPhone3").number = "0990008888";
        ourApples.get("iPhone3").name = "Sany";
        System.out.println(ourApples.get("iPhone3").number);
        System.out.println(ourApples.get("iPhone3").name);



    }

    public static void unlock(Phone phone) {

        if (phone.getColor() == null) {
            throw new MyExc("Phone has no color ");
        }
        phone.unlock();

        System.out.println("Phone unlocked");
    }
}



