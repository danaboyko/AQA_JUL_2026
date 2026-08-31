package org.prog.session8;

//TODO: interface IPhone
// Apple and Android implement IPhone
// IPhone must: unlock phone. Android: with fingerprint, Apple: with faceId
// HomeWork must have method that accepts IPhone and unlocks it

public class Main {
    public static void main(String[] args) {

        IPhone iPhones1 = new IPhone();
        IPhone iPhones2 = new IPhone();
        IPhone iPhones3 = new IPhone();
        IPhone iPhones4 = new IPhone(null);
        Android android1 = new Android();
        Android android2 = new Android();
        Android android3 = new Android();
        Android android4 = new Android(null);

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
            System.out.println( "Exception" +" " + e.getMessage());
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
    }

       public static void unlock(Phone phone) {

        if (phone.getColor() == null){
            throw new MyExc( "Phone has no color ");
        }
           phone.unlock();
        System.out.println("Phone unlocked");
    }
    }



