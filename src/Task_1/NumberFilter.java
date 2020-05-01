package Task_1;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class NumberFilter {
    public void evaluate(){
        try(BufferedReader reader = Input.getReader()) {
            System.out.println("Введите целое число!");
            int  testInteger = Integer.parseInt( reader.readLine() );
            isPrime(testInteger );
            isEven( testInteger );
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public boolean isEven(int x){
        if (x%2==0) {
            System.out.println("Число четное");
            return true;

        }   System.out.println("Число нечетное");
           return false;
    }
    public boolean isPrime(int x){
        BigInteger bigInteger = BigInteger.valueOf(x);
        boolean result = bigInteger.isProbablePrime((int) Math.log(x));
        System.out.println(result ? "Число простое" : "Число составное");
        return  result;
    }

}
