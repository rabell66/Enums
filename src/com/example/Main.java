package com.example;

import com.example.common.Month;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static com.example.common.Month.valueOf;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Please choose one of the following Months %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s\n\n",
                Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.JUNE, Month.JULY, Month.AUGUST,
                Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
        Scanner tanner = new Scanner(System.in);
       Month input = Month.valueOf(tanner.nextLine().toUpperCase());
        ArrayList<String> monthsRemaining = new ArrayList();
        System.out.println(input);

        switch (input) {
            case JANUARY:
                monthsRemaining.add(Month.JANUARY.getEnglishName());
            case FEBRUARY:
                monthsRemaining.add(Month.FEBRUARY.getEnglishName());
            case MARCH:
                monthsRemaining.add(Month.MARCH.getEnglishName());
            case APRIL:
                monthsRemaining.add(Month.APRIL.getEnglishName());
            case MAY:
                monthsRemaining.add(Month.MAY.getEnglishName());
            case JUNE:
                monthsRemaining.add(Month.JUNE.getEnglishName());
            case JULY:
                monthsRemaining.add(Month.JULY.getEnglishName());
            case AUGUST:
                monthsRemaining.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER:
                monthsRemaining.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER:
                monthsRemaining.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER:
                monthsRemaining.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER:
                monthsRemaining.add(Month.DECEMBER.getEnglishName());
            default:
                break;
        }
        System.out.println(monthsRemaining);


//        Month month = new Month.AUGUST;
//        month.getEnglishName(input);

//        System.out.println(" Month is a String ? " + (month.getEnglishName() instanceof String) );

        // write your code here
    }
}
