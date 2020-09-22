import java.util.Scanner;
public class StudentClass {
    static String name;
    static int n;

    StudentClass(){
        System.out.println("Unknown");

    }
    StudentClass(String name){
        System.out.println("Student Name : " +name);

    }
    StudentClass(int n){
        System.out.println("Student Roll number : " +n);
    }

    public static void main(String[] args) {
        StudentClass NAME = new StudentClass("Nagendra");
        StudentClass N = new StudentClass( 23);


    }
}
