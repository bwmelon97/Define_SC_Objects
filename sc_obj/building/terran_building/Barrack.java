package sc_obj.building.terran_building;

import sc_obj.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.building_traits.*;
import sc_obj.common_traits.*;
import sc_obj.unit.Unit;

public class Barrack extends TerranBuilding
implements Liftable, Producer, Unlocker, Repairable
{
    LiftableImpl l = new LiftableImpl();
    ProducerImpl p = new ProducerImpl();
    UnlockerImpl u = new UnlockerImpl();

    public Barrack (Position ps) {
        super(1000, ps);

        ProducingCost pc = new ProducingCost(150, 0, 80);
        Size size = new Size(40, 30);

        this.pc = pc;
        this.size = size;

        /* ProductList에 마린 추가 
           파이어벳, 메딕, 고스트는 어떻게 할 지 고민 */
        // p.addProductList( /* Marrine */ );
        
        /* UnlockList에 팩토리, 아카데미 추가 */
        // u.addUnlockList(o);
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