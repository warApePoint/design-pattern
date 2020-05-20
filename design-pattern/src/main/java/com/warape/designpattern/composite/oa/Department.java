package com.warape.designpattern.composite.oa;

import java.util.ArrayList;
import java.util.List;

public class Department extends HumanResource {

    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(Long id) {
        super(id);
    }


    @Override
    public double calculateSalary() {
        double calculateSalary = 0;
        for (HumanResource subNode : subNodes) {
            calculateSalary += subNode.calculateSalary();
        }
        return calculateSalary;
    }

    public void addSubNode(HumanResource humanResource){
        subNodes.add(humanResource);
    }


}
