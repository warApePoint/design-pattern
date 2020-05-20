package com.warape.designpattern.decorator.menu;

import com.warape.designpattern.decorator.menu.permissons.*;
import com.warape.designpattern.decorator.menu.roles.AdminUser;
import com.warape.designpattern.decorator.menu.roles.LoginUser;
import com.warape.designpattern.decorator.menu.roles.NotLoginUser;
import com.warape.designpattern.decorator.menu.roles.Roles;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Roles notLoginUser = new NotLoginUser(NotLoginUser.createRoles());
        System.out.print("未登录用户: ");
        notLoginUser.addPermission().forEach(p -> System.out.print(p.view()+"/"));
        System.out.println();

        Homework homework = new Homework();
        Problem problem = new Problem();
        Growth growth = new Growth();
        List<Permission> loginPermissions = new ArrayList<>();
        loginPermissions.add(homework);
        loginPermissions.add(problem);
        loginPermissions.add(growth);
        Roles loginUser = new LoginUser(notLoginUser, loginPermissions);
        System.out.print("登录用户:  ");
        loginUser.addPermission().forEach(p -> System.out.print(p.view()+"/"));
        System.out.println();

        SystemSet systemSet = new SystemSet();
        List<Permission> adminPermissions = new ArrayList<>();
        adminPermissions.add(systemSet);
        Roles adminUser = new AdminUser(loginUser,adminPermissions);
        System.out.print("管理员登录:  ");
        adminUser.addPermission().forEach(p -> System.out.print(p.view()+"/"));
    }
}