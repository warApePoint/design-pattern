package com.warape.designpattern.decorator.menu.roles;

import com.warape.designpattern.decorator.menu.permissons.Permission;

import java.util.List;

public class LoginUser extends Decorator {


    public LoginUser(Roles roles, List<Permission> permissions) {
        super(roles, permissions);
    }

    @Override
    public List<Permission> addPermission() {
        List<Permission> permissions = super.addPermission();
        permissions.addAll(super.permissions);
        return permissions;
    }
}