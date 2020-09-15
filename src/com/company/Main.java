package com.company;




import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)  {
        AtomicInteger a = new AtomicInteger();
        String fileName = "C:\\Users\\plato\\IdeaProjects\\untitled32\\input.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(x -> a.set((int) (a.get() + (Math.floor(Integer.parseInt(x) / 3) - 2))));
            System.out.print(a);
        }

        catch (IOException e) {
            e.printStackTrace();
        }

}}