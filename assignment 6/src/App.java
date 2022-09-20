import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner myInput = new Scanner( System.in);
        
        
        
        System.out.print("what is the number");
        int number1 = myInput.nextInt();
        System.out.print("what is the next number");
        int number2 = myInput.nextInt();
        System.out.print("what is the next number");
        int number3 = myInput.nextInt();
        
        // nuber1 is the bigest
        if( (number1 > number2) && (number1 > number3) ){
            System.out.println(number1);
    
        }

        // number2 is the biggest

        if ( (number2 > number1) && (number2 > number3) ){

            System.out.println(number2);
        }



        // number 3 is the biggest. 
        if ( (number3 > number1)  && (number3 > number2 )){

            System.out.println(number3);

        }




        
    }
}
