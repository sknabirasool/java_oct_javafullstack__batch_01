package org.javacourse.dataTypes;

public class TelevisionLocalVariables {
    int height=34;
    int width=22;

    public  void incresedVolume(){
        System.out.println("Tv volume is increased");
    }
    public  void decreaseVolume(){
        System.out.println("Tv volume is decresed");
    }
    public static void main(String[] args) {

        TelevisionLocalVariables remote=new TelevisionLocalVariables();

        remote.incresedVolume();
        remote.decreaseVolume();

        System.out.println("Television height is"+remote.height+" Television width is"+remote.width);

    }

}
