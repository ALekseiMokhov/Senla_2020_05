package Task_2;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class LeastCommonMultiplyFinder {

    public void evaluate(){
        try(BufferedReader reader = Input.getReader()) {
            System.out.println("Введите целое число!");
            int  firstNumber = Integer.parseInt( reader.readLine() );
            System.out.println("Введите целое число!");
            int  secondNumber = Integer.parseInt( reader.readLine() );

            if(firstNumber==0 && secondNumber==0) throw new InputMismatchException();
            System.out.println("Наименьшее общее кратное: "+LCM( firstNumber,secondNumber ));
            System.out.println("Наибольший общий делитель: "+GCD( firstNumber,secondNumber ));

        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int GCD(int a, int b) {
        int res;
        if (b == 0) res = Math.abs(a);
        else res = (GCD (b, a % b));
        return res;
    }
    public int LCM(int a, int b) {
        int res =(a * b) / GCD(a, b);
        return  res;
    }
}
