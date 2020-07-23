package com.warape.designpattern.composite.oa;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.map.MapUtil;
import cn.hutool.json.JSONUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test {

    private static final long ORGANIZATION_ROOT_ID = 0;
    private static final Map<Long, List<Long>> DEPARTMENT_ID_MAP = MapUtil.<Long, List<Long>>builder()
            .put(0L, ListUtil.toList(1L, 2L, 3L))
            .build();

    private static final Map<Long, List<Long>> EMPLOYEE_EMPLOYEE_MAP = MapUtil.<Long, List<Long>>builder()
            .put(1L, ListUtil.toList(4L, 5L, 6L))
            .put(2L, ListUtil.toList(7L, 8L, 9L))
            .put(3L, ListUtil.toList(10L))
            .build();

    private static final Map<Long, Double> EMPLOYEE_INFO_MAP = MapUtil.<Long, Double>builder()
            .put(4L, 10.00)
            .put(5L, 10.00)
            .put(6L, 10.00)
            .put(7L, 10.00)
            .put(8L, 10.00)
            .put(9L, 10.00)
            .put(10L, 10.00)
            .build();


    public static void main(String[] args) {
        Department department = buildOrganization();
        System.out.println("公司员工工资总和为: "+department.calculateSalary()+"元");
    }

    private static Department buildOrganization() {
        Department department = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(department);
        return department;
    }

    private static void buildOrganization(Department department) {
        //构建部门
        Long id = department.getId();
        List<Long> departmentIds = DEPARTMENT_ID_MAP.get(id);
        if (departmentIds != null) {
            departmentIds.forEach((subDepartmentId) -> {
                Department subDepartment = new Department(subDepartmentId);
                department.addSubNode(subDepartment);
                buildOrganization(subDepartment);
            });
        }

        // 构建员工
        List<Long> employeeList = EMPLOYEE_EMPLOYEE_MAP.get(department.getId());
        if (employeeList != null) {
            employeeList.forEach(employeeId -> {
                Double salary = EMPLOYEE_INFO_MAP.get(employeeId);
                department.addSubNode(new Dmployee(employeeId, salary));
            });
        }

    }
}