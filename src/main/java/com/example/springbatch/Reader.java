package com.example.springbatch;

import org.springframework.batch.item.ItemReader;

import java.util.Random;

public class Reader implements ItemReader<String> {
    private final String[] courses = {"Java", "String Boot", "Spring Batch"};

    @Override
    public String read() throws Exception {
        System.out.println("Inside Reader");
        return courses[new Random().nextInt(courses.length)];
    }
}
