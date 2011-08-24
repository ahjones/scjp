package com.extend;

import com.base.Beverage;

class Tea extends Beverage {
    private String f() {
        return getName();
    }
    
    @Override
    public String getName() {
        return super.getName();
    }
}

class MilkyTea {
    private String g() {
        Tea tea = new Tea();
        return tea.getName();
    }
}