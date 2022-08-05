
package org.metable.hex.soccer;

import java.io.IOException;

import org.metable.hex.soccer.domain.entity.SoccerUniverse;
import org.metable.hex.soccer.framework.adapters.file.SoccerUniverseFileAdapter;

public class App {

    public static void main(String[] args) throws IOException {
        SoccerUniverse soccerUniverse = SoccerUniverseFileAdapter.getInstance().getSoccerUniverse();

        System.out.println("Soccer universe: " + soccerUniverse);
    }

}
