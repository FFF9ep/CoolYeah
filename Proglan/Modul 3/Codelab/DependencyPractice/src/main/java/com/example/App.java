package com.example;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello Maven
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String text = "Hello Maven";
        String reverseText = StringUtils.reverse(text);
        System.out.println(reverseText);
    }
}

