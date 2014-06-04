package com.github.cb372.guessing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Author: chris
 * Created: 6/2/14
 */
public final class NumberWriter {

    private NumberWriter() {
    }

    static void writeToFile(final int number, final String charset) throws IOException {
        try(
                FileOutputStream stream = new FileOutputStream("number.txt");
                OutputStreamWriter out = new OutputStreamWriter(stream, charset)
        ) {
            out.write(number);
        }
    }

}
