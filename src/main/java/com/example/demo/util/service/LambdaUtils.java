package com.example.demo.util.service;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaUtils {
    public static Consumer<String> print = System.out::print;
    public static Function<Object, String> string= String::valueOf;
    public static Function<String, Integer> strToInt =Integer::parseInt;

}
