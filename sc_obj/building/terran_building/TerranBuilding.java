package sc_obj.building.terran_building;

import java.util.concurrent.TimeUnit;

import sc_obj.*;
import sc_obj.building.Building;
import sc_obj.races.Terran;

public abstract class TerranBuilding extends Building implements Terran {    
    
    private boolean isBurning;  // 불타고 있는 지 여부
    
    public TerranBuilding (final Position ps) {
        super(ps);
        this.isBurning = false;
    }

    public boolean isBurning() { return isBurning; }

    /* Thread Coding 익히기 전까지 구현하지 못할 듯 */
    protected void burning( final int MAX_HP ) {
        this.isBurning = true;
        while ( this.cur_HP < (MAX_HP / 3) ) {
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