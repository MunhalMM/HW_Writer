package com.telran.project.readerwriter;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WriterApp {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Hello");
        stringList.add("Java");
        try (Writer writer = new MyWriter()) {
            ((MyWriter) writer).write(stringList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
