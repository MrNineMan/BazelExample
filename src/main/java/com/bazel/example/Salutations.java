package com.bazel.example;

import com.bazel.example.greetings.Greeter;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;


public class Salutations {
    
    public static void main(String [] args) {
        Greeter.sayHello();
        TextIO textIO = TextIoFactory.getTextIO();

        String user = textIO.newStringInputReader()
        .withDefaultValue("admin")
        .read("Username");

        String password = textIO.newStringInputReader()
        .withMinLength(6)
        .withInputMasking(true)
        .read("Password");

    }
}