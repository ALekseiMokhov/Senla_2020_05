package Task_5;


import util.Input;

import java.io.BufferedReader;
import java.io.IOException;

public class PalindromeChecker {

    public void check(){
        try(BufferedReader reader = Input.getReader()) {
            System.out.println("Введите число для проверки:");
            int testNumber = Integer.parseInt( reader.readLine() );
            System.out.println(isPalindrome( testNumber )? "Число является палиндромом" : "Число не является палиндромом");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public boolean isPalindrome(int x){
        if (x < 0)
            return false;
        int pivot = 1;
        while (x / pivot >= 10) {
            pivot *= 10;
        }

        while (x != 0) {
            int left = x / pivot;
            int right = x % 10;

            if (left != right)
                return false;

            x = (x % pivot) / 10;
            pivot /= 100;
        }

        return true;
    }
}
