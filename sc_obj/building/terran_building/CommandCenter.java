package sc_obj.building.terran_building;

import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.Building;
import sc_obj.building.building_traits.*;
import sc_obj.common_traits.*;
import sc_obj.unit.Unit;
import sc_obj.*;

/* 커멘드 센터 */
public class CommandCenter extends TerranBuilding 
implements Liftable, Supplier, Producer, Unlocker, Repairable
{
    /* Static Properties */
    private static final int MAX_HP = 1500;
    private static final Size size = new Size(40, 30);
    private static final ProducingCost pc = new ProducingCost(400, 0, 120);

    /* Interface Implement Classes */
    LiftableImpl l = new LiftableImpl();
    SupplierImpl s = new SupplierImpl(10);
    ProducerImpl p = new ProducerImpl();
    UnlockerImpl u = new UnlockerImpl();

    /* Constructor */
    public CommandCenter (Position ps) {
        super(ps);

        /* ProductList에 scv 추가 */
        // p.addProductList( /* SCV */ );
        
        /* UnlockList에 서플라이 디포, 정제소 추가 */
        // u.addUnlockList(o);
    }

    /* Getter Methods */
    public static int getMAX_HP() { return MAX_HP; }
    public static Size getSize() { return size; }
    public static ProducingCost getProducingCost() { return pc; }

    /* 해당 위치에 건물을 지을 수 있는 지 */
    public static boolean isBuildable ( Position ps ) {
        return Building.isBuildable(ps, CommandCenter.size);
    }

    /* Liftable Methods */
    @Override
    public void lift() { l.lift(); }
    public void move() { l.move(); }
    public void stop() { l.stop(); }
    public void land() { l.land(); }
    public boolean isLift() { return l.isLift(); }

    /* Supplier Methods */
    @Override
    public void supply() { s.supply(); }

    /* Producer Methods */
    @Override
    public void produce(Unit unit) { p.produce(unit); }

    /* Unlocker Methods */
    @Override
    public void unlock(Object o) { u.unlock(o); }
}