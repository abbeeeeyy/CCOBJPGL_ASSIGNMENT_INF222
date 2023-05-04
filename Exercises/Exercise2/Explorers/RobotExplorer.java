package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    public void visit(Earth earth) {
        System.out.println("Loading instructions from system... exploring Earth");
    }

    public void visit(Pluto pluto) {
        System.out.println("Loading instructions from system... exploring Pluto");
    }

    public void visit(Neptune neptune) {
        System.out.println("Loading instructions from system... exploring Neptune");
    }

    public void visit(Venus venus) {
        System.out.println("Loading instructions from system... exploring Venus");
    }

    public void visit(Uranus uranus) {
        System.out.println("Loading instructions from system... exploring Uranus");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Loading instructions from system... exploring Jupiter");
    }

    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }
}
