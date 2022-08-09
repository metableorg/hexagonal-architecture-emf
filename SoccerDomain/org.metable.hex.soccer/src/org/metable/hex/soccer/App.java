
package org.metable.hex.soccer;

import java.io.IOException;

import org.metable.hex.soccer.application.ports.input.SoccerUniverseInputPort;
import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.framework.adapters.file.SoccerUniverseFileAdapter;

public class App {

    public static void main(String[] args) throws IOException {
        
        SoccerUniverseInputPort input = new SoccerUniverseInputPort(SoccerUniverseFileAdapter.getInstance());
        
        input.newTeam("Man U");
        input.newTeam("Man City");
        input.newTeam("Everton");

        SoccerUniverse soccerUniverse = SoccerUniverseFileAdapter.getInstance().getSoccerUniverse();
        System.out.println("Soccer universe: " + soccerUniverse);
        
        input.removeTeam("Man City");
        soccerUniverse = SoccerUniverseFileAdapter.getInstance().getSoccerUniverse();
        System.out.println("Soccer universe: " + soccerUniverse);
        
        input.undo();
//        input.undo();
//        input.undo();
        
        soccerUniverse = SoccerUniverseFileAdapter.getInstance().getSoccerUniverse();
        System.out.println("Soccer universe: " + soccerUniverse);
    }

}
