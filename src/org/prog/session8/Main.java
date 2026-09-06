package org.prog.session8;

//TODO: interface IPhone
// Apple and Android implement IPhone
// IPhone must: unlock phone. Android: with fingerprint, Apple: with faceId
// HomeWork must have method that accepts IPhone and unlocks it

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IPhone iPhones1 = new IPhone("0507775588","Ira");
        IPhone iPhones2 = new IPhone("0975556677","Eva");
        IPhone iPhones3 = new IPhone("0664445599","Joni");
        IPhone iPhones4 = new IPhone();
        Android android1 = new Android("0501112233","Anna");
        Android android2 = new Android("0672223311","Deny");
        Android android3 = new Android("0993331122","Petro");
        Android android4 = new Android();

        iPhones1.color = "white";
        System.out.println("IPhone1" + " " + iPhones1.color);
        iPhones2.color = "white";
        System.out.println("IPhone2" + " " + iPhones2.color);
        iPhones3.color = "gold";
        System.out.println("IPhone3" + " " + iPhones3.color);
        iPhones4.color = null;
        android1.color = "green";
        android2.color = "green";
        android3.color = "black";
        android4.color = null;
        try {
            unlock(android4);
            unlock(iPhones4);
        } catch (MyExc e) {
            System.out.println("Exception" + " " + e.getMessage());
        }
        unlock(iPhones1);
        unlock(iPhones2);
        unlock(iPhones3);
        unlock(android1);
        unlock(android2);
        unlock(android3);

        System.out.println(android1.equals(iPhones1));
        System.out.println(android1.equals(android2));
        System.out.println(iPhones1.equals(iPhones2));
        System.out.println(iPhones2.equals(iPhones3));
        System.out.println(android2.equals(android3));
        System.out.println(android1.hashCode());
        System.out.println(android2.hashCode());
        System.out.println(android3.hashCode());
        System.out.println(iPhones1.hashCode());
        System.out.println(iPhones2.hashCode());
        System.out.println(iPhones3.hashCode());

        Map<String,String> ourPhone  = new HashMap<>();
        ourPhone.put(android1.numberId,android1.name);
        System.out.println("Android1"+ ourPhone);
        Map<String,String> ourPhone1  = new HashMap<>();
        ourPhone1.put(android2.numberId,android2.name);
        System.out.println("Android2"+ ourPhone1);
        Map<String,String> ourPhone2  = new HashMap<>();
        ourPhone2.put(android3.numberId,android3.name);
        System.out.println("Android3"+ ourPhone2);
        Map<String,String> ourPhone4  = new HashMap<>();
        ourPhone4.put(iPhones1.numberId,iPhones1.name);
        System.out.println("IPhone1"+ ourPhone4);
        Map<String,String> ourPhone5  = new HashMap<>();
        ourPhone5.put(iPhones2.numberId,iPhones2.name);
        System.out.println("IPhone2"+ ourPhone5);
        Map<String,String> ourPhone6  = new HashMap<>();
        ourPhone6.put(iPhones3.numberId,iPhones3.name);
        System.out.println("IPhone3"+ ourPhone6);

    }

    public static void unlock(Phone phone) {

        if (phone.getColor() == null) {
            throw new MyExc("Phone has no color ");
        }
        phone.unlock();

        System.out.println("Phone unlocked");
    }
}



