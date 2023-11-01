package org.javacourse.dataTypes;
public class LocalVariables {
    //local variables
    public  void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        LocalVariables obj=new LocalVariables();
        obj.add(10,20);


    }
}
