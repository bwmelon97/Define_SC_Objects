package sc_obj.building.terran_building;

import java.util.concurrent.TimeUnit;

import sc_obj.*;
import sc_obj.building.Building;
import sc_obj.races.Terran;

public class TerranBuilding extends Building implements Terran {    
    public TerranBuilding (final int MAX_HP, final ProducingCost pc, final Position ps, final Size size) {
        super( MAX_HP, pc, ps, size );
    }

    /* Thread Coding 익히기 전까지 구현하지 못할 듯 */
    protected void burning() {
        while ( this.cur_HP < (this.MAX_HP / 3) ) {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
                this.cur_HP--;
                System.out.println("불타고 있습니다! HP: " + this.cur_HP);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }
}