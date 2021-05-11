import java.io.FileNotFoundException;
import java.text.ParseException;

import java.io.IOException;

public class Test {
    public void run() throws IOException, ParseException {
        //throw new IOException();

        throw new ParseException("command in line.",2);
    }

    public void input() throws IOException, FileNotFoundException {

    }
}
