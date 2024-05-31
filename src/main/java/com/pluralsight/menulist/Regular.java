package com.pluralsight.menulist;

import com.pluralsight.ITopping;

public class Regular implements ITopping {
    String name;

    public Regular(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "name='" + name + '\'' +
                '}';
    }
}
