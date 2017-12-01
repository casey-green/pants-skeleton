package com.clg.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Utils {
    public static Stream<String> getLines(String path) throws IOException {
        return Files.lines(Paths.get(path));
    }

    public static Stream<String> stdInLines() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.lines();
    }
}
