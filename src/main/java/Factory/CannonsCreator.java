package Factory;

import Factory.Cannons.LaserCannon;
import Factory.Cannons.MachineCannon;
import Factory.Cannons.PlasmaCannon;

public class CannonsCreator {

    public PropertiesCannon create(CannonType cannonType) {

        PropertiesCannon cannon = null;

        switch ((cannonType)) {
            case LASER:
                LaserCannon laserCannon = new LaserCannon(100, 200, 350);
                cannon=laserCannon;
                System.out.println(laserCannon.display());
                break;
            case MACHINE:
                MachineCannon machineCannon = new MachineCannon(200, 400, 500,450);
                cannon=machineCannon;
                System.out.println(machineCannon.display());
                break;
            case PLASMA:
                PlasmaCannon plasmaCannon = new PlasmaCannon(300, 500, 800);
                cannon = plasmaCannon;
                System.out.println(plasmaCannon.display());
                break;
                default:
                    System.out.println("Invalid type of cannon");
        }
        return cannon;
    }
}
