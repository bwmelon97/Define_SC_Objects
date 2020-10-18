package sc_obj.building.terran_building;

import java.util.ArrayList;

import non_obj.upgrade.Upgrade;
import sc_obj.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.common_traits.*;
import sc_obj.building.building_traits.*;

public final class Academy extends TerranBuilding
implements Unlocker, Upgrader, Repairable
{
    /* Static Properties */
    static public final Size size = new Size(30, 20);
    static public final ProducingCost pc = new ProducingCost(150, 0, 80);
    static public final int MAX_HP = 600;

    /* Interface Implement Classes */
    UnlockerImpl ul = new UnlockerImpl();
    UpgraderImpl up = new UpgraderImpl();

    /* Constructor */
    public Academy(Position ps) {
        super(ps);
    }    

    /* Unlocker Methods Overriding */
    @Override
    public void unlock(Object o) { ul.unlock(o); }
    public ArrayList<Object> getUnlockList() { return ul.getUnlockList(); }

    /* Upgrader Methods Overriding */
    @Override
    public void upgrade(Upgrade upgrade) { up.upgrade(upgrade); }
    public ArrayList<Upgrade> getUpgradeList() { return up.getUpgradeList(); }
}