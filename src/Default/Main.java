package Default;

import java.sql.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //the code is here
       /*Multiline comments
      java course
        */
        System.out.println("hello nacera belkadi ");
        char one='G';
        System.out.println(one);
        String name =new String("belkadi nacera");
        System.out.println(name.toUpperCase());
        LocalDate now= LocalDate.now();
        System.out.println(now.getMonth());
        Person alex=new Person("alex");
        Person nacera =alex;
        System.out.println("before changin alex");
        System.out.println(alex.name+ " " + nacera.name);
        alex.name="ahmed";
        System.out.println("after changin alex");
        System.out.println(alex.name+ " " + nacera.name);
       // arithmetic operation
        double random = Math.random();
        System.out.println(random);
        System.out.println(Math.sqrt(25));
        //comparison operation
        int ageNacera=21;
        int ageAhlam=15;
        boolean isnaceraOlderThanAhlam= ageNacera>ageAhlam;
        System.out.println(isnaceraOlderThanAhlam);
        //if statement
        int age=21;
        if (age >= 25) {
            System.out.println("your age like my age ");
        }else {
            System.out.println("your are older than me");
        }
        // ternary statement
        int ageTest=15;
        String msg=ageTest>=18 ? "false age " :"true age ";
        System.out.println(msg);
        //Switch statement
        String gender = "Female";

/*
switch(gender) {
        case "Female":
            System.out.println("The person is female.");
            break;
        default:
            // Code to be executed if gender doesn't match any case
            System.out.println("The gender is not specified or is not female.");
            break;
    }
* */


        //Arrays
        int [] numbers= {2,0,1};
        System.out.println(Arrays.toString(numbers));
        // loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //break and loop
        String[] names= {"nina", "siham"};

        for (String nom : names) {
            if (name.equals("siham")) {
                break; //breaks out of any loop
            }
            System.out.println(nom);
        }
        //while

        int count =0;
        do {
            System.out.println(count);
            count ++;
        }
        while (count<=20);
        //scanner allows us to take user input from the console
        Scanner scanner=new Scanner(System.in);
        System.out.println("what's your name");
        String userName=scanner.nextLine();

    }



    static  class  Person{
        String name;
        Person(String name ){
            this.name=name;
        }
    }
}