package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    public void visit(Earth earth) {
        System.out.println("Deploying tools specific to Earth... exploring life");
    }

    public void visit(Pluto pluto) {
        System.out.println("Deploying tools specific to Pluto... exploring life");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Deploying tools specific to Jupiter... exploring life");
    }

    public void visit(Uranus uranus) {
        System.out.println("Deploying tools specific to Uranus... exploring life");
    }

    public void visit(Venus venus) {
        System.out.println("Deploying tools specific to Venus... exploring life");
    }

    public void visit(Neptune neptune) {
        System.out.println("Deploying tools specific to Neptune... exploring life");
    }
}
