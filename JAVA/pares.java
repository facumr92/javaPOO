
import java.util.Scanner;
public class pares{


    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        int j, i;

        System.err.println("Ingrese valor 1");
        j= sc.nextInt();


        System.err.println("Ingrese valor 2");
        i= sc.nextInt();


        for(int x= j; x<i; x+=2){


            System.out.println(x);

        }


    }
}