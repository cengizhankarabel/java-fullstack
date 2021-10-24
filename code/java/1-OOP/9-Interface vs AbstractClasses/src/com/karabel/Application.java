package com.karabel;


import com.karabel.work.ProjectOneWork;
import com.karabel.work.ProjectTwoWork;
import com.karabel.work.TechWork;

public class Application {
    public static void main(String[] args) {

        TechWork techWork = new ProjectOneWork();

        techWork.doX();
        techWork.doY();
        techWork.doTechWork();
    }
}
