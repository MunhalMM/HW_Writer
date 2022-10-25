package com.telran.project.readerwriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class MyWriter extends Writer {

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        String s = new String(cbuf, off, len);
        System.out.println(s);
    }

    @Override
    public void flush() throws IOException {
        //
    }

    @Override
    public void close() throws IOException {
        //
    }

    public void write(List<String> stringList) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stringList) {
            stringBuilder.append(s);
        }
        super.write(stringBuilder.toString());
    }

}
