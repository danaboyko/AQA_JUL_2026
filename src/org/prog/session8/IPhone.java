package org.prog.session8;

public class IPhone implements Phone{
    public String color;

    @Override
    public boolean equals (Object obj){
        if (obj instanceof IPhone){
            IPhone c = (IPhone) obj;
            boolean isEqual = this.color.equals(c.color);
            return isEqual;}
        return false;}
    @Override
    public void unlock (){
        System.out.println("IPhone with face");
    }
}
