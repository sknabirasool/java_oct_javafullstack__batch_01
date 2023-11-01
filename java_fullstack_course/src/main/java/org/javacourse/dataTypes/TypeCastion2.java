package org.javacourse.dataTypes;

public class TypeCastion2 {
    public static void main(String[] args) {

        double d=1000.024; //8 bytes
        long l= (long) d;//down casting //8
        int i=(int)l;//4 bytes

        System.out.println("Rajendra marks "+d+" long for "+l+" int for "+i);






    }
}
