package com.prts.vinyard.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootObject {
    @SerializedName("m_Item1")
    public List<MenuItemOne> menuItemOne;
    @SerializedName("m_Item2")
    public List<MenuItemTwo> menuItemTwo;

    public List<MenuItemOne> getMenuItemOne() {
        return menuItemOne;
    }

    public void setMenuItemOne(List<MenuItemOne> menuItemOne) {
        this.menuItemOne = menuItemOne;
    }

    public List<MenuItemTwo> getMenuItemTwo() {
        return menuItemTwo;
    }

    public void setMenuItemTwo(List<MenuItemTwo> menuItemTwo) {
        this.menuItemTwo = menuItemTwo;
    }
}
