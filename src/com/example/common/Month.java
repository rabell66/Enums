package com.example.common;

public enum Month {
    JANUARY(), FEBRUARY(), MARCH(), APRIL(), MAY(), JUNE(), JULY(), AUGUST(), SEPTEMBER(), OCTOBER(), NOVEMBER()
    , DECEMBER();
    public String getEnglishName() {
        return englishName;

    }

    private String englishName;


    Month() {
        this.englishName = this.toString().toLowerCase();
    }

}