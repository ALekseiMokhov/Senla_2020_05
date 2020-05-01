package Task_3;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputWordsCounter {

    public void calculate (){
        try(BufferedReader reader = Input.getReader()){
            System.out.println("Введите текст!");
            String  inputText = reader.readLine();
            countAndPrintWords( inputText );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public int countAndPrintWords(String s){
        String [] words = s.split( " " );
        System.out.println("Количество слов: " + words.length);
        List <String> modifiedWords = Stream.of( words )
                .map( w -> w.substring( 0, 1 ).toUpperCase() + w.substring( 1 ) )
                .sorted()
                .collect( Collectors.toList() );
        Stream.of( modifiedWords ).forEach( System.out::println );
        return modifiedWords.size();
    }

}
