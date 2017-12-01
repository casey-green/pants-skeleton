package com.clg;

import com.clg.lib.Utils;

import java.io.IOException;
import java.util.stream.Stream;

class JavaMain {
    public static void main(String[] args) {
        try (Stream<String> stream = Utils.getLines(args[0])) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}