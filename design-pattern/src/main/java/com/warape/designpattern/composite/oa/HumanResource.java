package com.warape.designpattern.composite.oa;

public abstract class HumanResource {

    protected Long id;
    protected double salary;

    public HumanResource(Long id) {
        this.id = id;
    }

    /**
     * 计算工资
     * @return double
     */
    public abstract double calculateSalary();

    public Long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
