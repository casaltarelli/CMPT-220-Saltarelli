package com.company;

public class IllegalTriangleException extends Throwable {
    // ----- Question 12.5 -----

    public IllegalTriangleException(String message) {
        super("This Triangle is Invalid!");
    }
}
