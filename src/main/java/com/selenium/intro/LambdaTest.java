package com.selenium.intro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaTest {
    public static void main(String[] args) {
List<String> values= Arrays.asList("raj","krish","raghu","lasya");
values.stream().map(Test::new).forEach(System.out::print);


    }
}
