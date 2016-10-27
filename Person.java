import java.util.Scanner;

/**
 * Created by sing_ on 10/27/2016.
 */
public class Person {
    private String last;
    private String first;
    private String zip;
    //default constructor
    public Person(){
        last = "X";
        first = "X";
        zip = "X";
    }

    public void getPerson(String l, String f, String z){
        this.last = l;
        this.first = f;
        this.zip = z;
    }

    public void display(){
        System.out.println(this.last + this.first + this.zip);
    }

    public static void main(String [] args){
        Person person = new Person();
        Person person2 = new Person();

        person.display();
        person2.display();

    }

}
