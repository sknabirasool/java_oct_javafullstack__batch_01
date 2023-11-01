package org.javacourse.dataTypes;
public class InstanceVariables {
    int height=10;//instance variables stores heap Memory
    int width=20;
    //local variables  stores stack Memory
    //method
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);//50
    }
    public  void sub(int a,int b)
    {
        int c;
        c=a-b;
        System.out.println("result="+c);
    }
    public static void main(String[] args) {
        InstanceVariables ref=new InstanceVariables();
        System.out.println(ref.height);
        System.out.println(ref.width);
        ref.add(20,30);
        ref.sub(200,20);
    }
}
