package sc_obj.building.terran_building;

import sc_obj.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.building_traits.*;
import sc_obj.common_traits.*;
import sc_obj.resource.Gas;

public class Refinery extends TerranBuilding 
implements GasStation, Repairable 
{
    /* Static Properties */
    private static final int MAX_HP = 750;
    private static final Size size = new Size(40, 20);
    private static final ProducingCost pc = new ProducingCost(100, 0, 40);

    /* Interface Implement Class */
    GasStationImpl g;
    
    /* Constructor */
    public Refinery( Position ps, Gas gasResource ) {
        super(ps);
        this.g = new GasStationImpl(gasResource);
    }

    /* Getter Methods */
    public static int getMaxHp() { return MAX_HP; }
    public static ProducingCost getPc() { return pc; }
    public static Size getSize() { return size; }
    
    /* 리파이너리의 isBuildable은 GasStation의 규칙을 따른다. */
    public static boolean isBuildable(Position ps) {
        return GasStation.isBuildable(ps);
    }

    /* Building의 isBuildable 규칙은 따르지 않도록 함. */
    public static boolean isBuildable(Position ps, Size size) {
        System.out.println("리파이너리는 Building의 isBuildable 규칙을 따르지 않습니다.");
        return false;
    }

    /* GasStaion 메서드 구현 */
    @Override
    public int beExtracted() { return g.beExtracted(); }

    @Override
    public Gas getGasResource() { return g.getGasResource(); }
}