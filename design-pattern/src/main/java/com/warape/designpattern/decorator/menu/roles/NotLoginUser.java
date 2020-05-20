package com.warape.designpattern.decorator.menu.roles;

import com.warape.designpattern.decorator.menu.permissons.*;

import java.util.ArrayList;
import java.util.List;

public class NotLoginUser implements Roles {

    private List<Permission> permissions;

    public NotLoginUser(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public List<Permission> addPermission() {
        return permissions;
    }

    public static List<Permission> createRoles(){
        QA qa = new QA();
        Articles articles = new Articles();
        Boutique boutique = new Boutique();
        Bubble bubble = new Bubble();
        Shop shop = new Shop();
        List<Permission> notLoginPermissions = new ArrayList<>();
        notLoginPermissions.add(qa);
        notLoginPermissions.add(articles);
        notLoginPermissions.add(boutique);
        notLoginPermissions.add(bubble);
        notLoginPermissions.add(shop);
        return notLoginPermissions;
    }
}