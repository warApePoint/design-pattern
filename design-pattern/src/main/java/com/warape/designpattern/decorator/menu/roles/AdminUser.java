package com.warape.designpattern.decorator.menu.roles;

import com.warape.designpattern.decorator.menu.permissons.Permission;

import java.util.List;

public class AdminUser extends Decorator {


    public AdminUser(Roles roles, List<Permission> permissions) {
        super(roles, permissions);
    }

    @Override
    public List<Permission> addPermission() {
        List<Permission> permissions = super.addPermission();
        boolean b = permissions.addAll(super.permissions);
        return permissions;
    }
}