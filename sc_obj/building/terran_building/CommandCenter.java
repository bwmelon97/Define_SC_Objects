package sc_obj.building.terran_building;

import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.building_traits.*;
import sc_obj.common_traits.*;
import sc_obj.unit.Unit;
import sc_obj.*;

/* 커멘드 센터 */
public class CommandCenter extends TerranBuilding 
implements Liftable, Supplier, Producer, Unlocker, Repairable
{
    LiftableImpl l = new LiftableImpl();
    SupplierImpl s = new SupplierImpl(10);
    ProducerImpl p = new ProducerImpl();
    UnlockerImpl u = new UnlockerImpl();

    public CommandCenter (Position ps) {
        super(1500, ps);
        ProducingCost pc = new ProducingCost(4000, 0, 120);
        Size size = new Size(40, 30);

        this.pc = pc;
        this.size = size;

        /* ProductList에 scv 추가 */
        // p.addProductList( /* SCV */ );
        
        /* UnlockList에 서플라이 디포, 정제소 추가 */
        // u.addUnlockList(o);
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

    /* Building의 미구현 메서드 */
    @Override
    public boolean isBuildable(Position ps) {
        /* 해당 위치에 건물을 지을 수 있는 지의 여부 */
        return true;
    }
}