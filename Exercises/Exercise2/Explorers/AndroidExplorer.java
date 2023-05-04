package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {

    public void visit(Mercury mercury) {
        System.out.println("Now arriving planet . . . Mercury");
    }

    public void visit(Mars mars) {
        System.out.println("Now arriving planet . . . Mars");
    }

    public void visit(Saturn saturn) {
        System.out.println("Now arriving planet . . . Saturn");
    }

    public void visit(Venus venus) {
        System.out.println("Now arriving planet . . . Venus");
    }

    public void visit(Earth earth) {
        System.out.println("Now arriving planet . . . Earth");
    }

    public void visit(Pluto pluto) {
        System.out.println("Now arriving planet . . . Pluto");
    }

    public void visit(Uranus uranus) {
        System.out.println("Now arriving planet . . . Uranus");
    }

    public void visit(Neptune neptune) {
        System.out.println("Now arriving planet . . . Neptune");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Now arriving planet . . . Jupiter");
    }
    
}
