package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(ageAndTemp(29, 23));
        System.out.println(ageAndTemp(26, 32));
        System.out.println(ageAndTemp(21, 43));
        System.out.println(ageAndTemp(32, 27));
        System.out.println(ageAndTemp(32, 29));

    }

    public static String ageAndTemp(int age, int temp) {
        if ((age > 20 && age < 40) && (temp > -20 && temp < 40)) {
            System.out.println("можно идти гулять");
        } else if ((age < 20) && (temp >= 0 && temp < 28)) {
            System.out.println("можно идти гулять");
        } else if ((age > 45) && (temp >= -20 && temp < 25)) {
            System.out.println("ОЖНО ИДТИ ГУЛЯТЬ");
        } else {
            System.out.println("оставайтесь дома");


        }
        return "Age=" + age + "Temp=" + temp;

    }
}
