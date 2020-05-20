package com.warape.designpattern.decorator.menu.roles;

import com.warape.designpattern.decorator.menu.permissons.Permission;

import java.util.List;

public abstract class Decorator implements Roles {

    private Roles roles;

    protected List<Permission> permissions;

    public Decorator(Roles roles, List<Permission> permissions) {
        this.roles = roles;
        this.permissions = permissions;
    }

    @Override
    public List<Permission> addPermission(){
        return roles.addPermission();
    }
}