import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       try{ 
        System.out.println("type your  number!");
        
        int num = sc.nextInt();
        
        if (num %2 ==0){
            System.out.println("you typed even number and its obviously not prime");
        }
        else{
            System.out.println("yout typed odd number");

                System.out.println("is  it prime number ?");
        
            if (isPrime(num)){
                    System.out.println("yes it is a prime number");
                }
            else{
                   System.out.println("no it is not a prime number");

                }
        }
    }catch (InputMismatchException e){
        System.out.println("you must type an integer");
    }
    finally{
        sc.close();
    }
}

private static boolean isPrime(int num){
    if( num <= 1)
    return false;

    for (int i = 2 ; i <= Math.sqrt(num); i++){
        if (num%i == 0) {
            return false;
        }
    }

    return true;
}

}
