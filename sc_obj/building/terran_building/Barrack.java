package sc_obj.building.terran_building;

import sc_obj.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.building_traits.*;
import sc_obj.building.Building;
import sc_obj.common_traits.*;
import sc_obj.unit.Unit;

public class Barrack extends TerranBuilding
implements Liftable, Producer, Unlocker, Repairable
{
    /* Static Properties */
    static private final Size size = new Size(40, 30);
    static private final ProducingCost pc = new ProducingCost(150, 0, 80);
    static private final int MAX_HP = 1000;
    
    /* Interface Implement Classes */
    LiftableImpl l = new LiftableImpl();
    ProducerImpl p = new ProducerImpl();
    UnlockerImpl u = new UnlockerImpl();

    /* Constructor */
    public Barrack (Position ps) {
        super(ps);

        /* ProductList에 마린 추가 
           파이어벳, 메딕, 고스트는 어떻게 할 지 고민 */
        // p.addProductList( /* Marrine */ );
        
        /* UnlockList에 팩토리, 아카데미 추가 */
        // u.addUnlockList(o);
    }

    /* Getter Methods */
    public static Size getSize() { return size; }
    public static int getMaxHp() { return MAX_HP; }
    public static ProducingCost getPc() { return pc; }

    /* 해당 위치에 건물을 지을 수 있는 지 */
    public static boolean isBuildable (Position ps) {
        return Building.isBuildable(ps, Barrack.size);
    }

    /* Liftable Methods */
    @Override
    public void lift() { l.lift(); }
    public void move() { l.move(); }
    public void stop() { l.stop(); }
    public void land() { l.land(); }

    /* Producer Methods */
    @Override
    public void produce(Unit unit) { p.produce(unit); }

    /* Unlocker Methods */
    @Override
    public void unlock(Object o) { u.unlock(o); }
}