package org.javacourse.dataTypes;

public class StaticVariables {
       int a=10; // instance variables
      static  int b=20; //static variables
      public  void add(int a,int b) //non-static method
      {
          int c; //local variables
          c=a+b;
          System.out.println("addition of Two numbers "+c);
      }
    public static void sub(int a,int b) //static method
    {
        int c; //local variables
        c=a-b;
        System.out.println("subtraction of Two numbers "+c);
    }
    public static void main(String[] args) {

        StaticVariables ref=new StaticVariables();

        System.out.println(ref.a);
        System.out.println(b);
        ref.add(10,20); //reference method
        ref.add(200,400);
        ref.add(44,67);

        sub(20,10);//non ref
        sub(30,40);
    }
}
