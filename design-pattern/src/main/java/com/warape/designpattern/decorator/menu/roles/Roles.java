package com.warape.designpattern.decorator.menu.roles;

import com.warape.designpattern.decorator.menu.permissons.Permission;

import java.util.List;

public interface  Roles {

    List<Permission> addPermission();
}