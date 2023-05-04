package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Earth;
import Planets.Pluto;
import Planets.Neptune;
import Planets.Venus;
import Planets.Jupiter;
import Planets.Uranus;
import Planets.Saturn;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Earth earth);
    
    void visit(Neptune neptune);

    void visit(Pluto pluto);

    void visit(Uranus uranus);

    void visit(Jupiter jupiter);

    void visit(Venus venus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
