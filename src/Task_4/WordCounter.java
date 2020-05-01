package Task_4;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    public void calculate(){
         try(BufferedReader reader = Input.getReader()) {
            System.out.println("Введите текст:");
            String  text = reader.readLine();
            System.out.println("Введите слово для поиска:");
            String word = reader.readLine();
            System.out.println("Слово встречается: " + countWord(text, word) + " раз(а)");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Long countWord(String text, String word){
        Map<String, Long> counterMap = new HashMap<>();
        Stream.of(text.toLowerCase().split( " " ))
                .collect( Collectors.groupingBy( k -> k, ()-> counterMap,
                        Collectors.counting()));
        System.out.println(counterMap.entrySet());
           return counterMap.get( word.toLowerCase() ) ;
    }

}
