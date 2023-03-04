package com.bootcoding.java.collections;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Details detail1 = new Details("Desc 1", 343, 3734, 40000);
        Details detail2 = new Details("Desc 2", 3232, 245, 55900);

        Income income = new Income();
        ArrayList<Details> details = new ArrayList<>();
        details.add(detail1);
        details.add(detail2);

        income.setDetails(details);

        Person person = new Person(1, "14 december", income);

        System.out.println(person.getId() + person.getCurrentDate() + person.getIncome().getDetails().get(0).description);
    }
}
