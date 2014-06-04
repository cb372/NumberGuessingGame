package com.github.cb372.guessing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Author: chris
 * Created: 6/2/14
 */
public class NumberWriter {

    static void writeToFile(Integer number) throws IOException {
        try(
                FileOutputStream stream = new FileOutputStream("number.txt");
                OutputStreamWriter out = new OutputStreamWriter(stream)
        ) {
            out.write(number.toString());
        }
    }

}
