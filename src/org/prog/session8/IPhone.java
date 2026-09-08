package org.prog.session8;

public class IPhone implements Phone{
    public String color;
    public String number;
    public String name;
    public IPhone(){

    }
    public IPhone(String color){
        this.color = color;

    }
    public IPhone(String number, String name) {
        this.number = number;
        this.name = name;
    }
    @Override
    public String getColor(){
        return color;
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof IPhone){
            IPhone c = (IPhone) obj;
            boolean isEqual = this.color.equals(c.color);
            return isEqual;}
        return false;}
    @Override
    public int hashCode(){
        return (this.color).hashCode();
    }
    @Override
    public String toString(){
        return "IPhone [color=" +color+"]";
    }
    @Override
    public void unlock (){
        System.out.println("IPhone with face");
    }
}

