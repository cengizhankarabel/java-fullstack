package com.karabel.work;

public abstract class ProjectWork implements TechWork {

    @Override
    public void doX() {
        System.out.println("doX");
    }

    @Override
    public void doY() {
        System.out.println("doY");
    }
}
