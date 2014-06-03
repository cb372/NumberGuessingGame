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
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("number.txt"));
        out.write(number.toString());
    }

}
