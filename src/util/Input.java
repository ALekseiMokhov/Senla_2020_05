package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
 private static BufferedReader reader = new BufferedReader( new InputStreamReader( System.in  ) );

    public static BufferedReader getReader() {
        return reader;
    }
}
