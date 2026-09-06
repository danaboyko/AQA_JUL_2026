package org.prog.session8;

public class Android implements Phone{
    public String color;
    public String numberId;
    public String name;
    public Android(){

    }
    public Android(String color) {
        this.color = color;
    }
        public Android(String numberId, String name){
        this.numberId = numberId;
        this.name = name;
    }
        @Override
        public String getColor(){
        return color;
        }
        @Override
    public boolean equals (Object obj){
        if (obj instanceof Android){
            Android c = (Android) obj;
            boolean isEqual = this.color.equals(c.color);
            return isEqual ;}
        return false;}
    @Override
    public int hashCode(){
            return (this.color).hashCode();
    }
    @Override
    public String toString(){
            return "Android [color=" +color+"]";

    }

    @Override
    public void unlock(){
        System.out.println("Android with fingerprint");
    }
}

