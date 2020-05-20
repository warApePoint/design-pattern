package com.warape.designpattern.composite.oa;

public class Dmployee extends HumanResource {

    public Dmployee(Long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }


}
