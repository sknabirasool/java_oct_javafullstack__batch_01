package org.javacourse;
import java.util.Scanner;
public class LoveException {
    public static void main(String[] args) {
        String girls[]={"Radha","baby","There"};
        for (String girl:girls){
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("Babu propose to "+girl+" Do you Accept?(yes/no)");
                String response=sc.nextLine();
                if(response.toLowerCase().equals("yes")) {
                    System.out.println("lets Have a date");
                    break;
                }else {
                    throw  new Exception("it's her loss,lets try another girl");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
