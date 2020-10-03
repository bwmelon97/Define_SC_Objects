package sc_obj.building.terran_building;

import sc_obj.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.building.building_traits.*;
import sc_obj.common_traits.*;
import sc_obj.resource.Gas;

public class Refinery extends TerranBuilding 
implements GasStation, Repairable 
{
    GasStationImpl g;
    
    public Refinery( Position ps, Gas gasResource ) {
        super(750, ps);
        ProducingCost pc = new ProducingCost(100, 0, 40);
        Size size = new Size(40, 20);
        
        this.pc = pc;
        this.size = size;
        this.g = new GasStationImpl(gasResource);
    }
    
    /* 리파이너리의 isBuildable은 GasStation의 규칙을 따른다. */
    public static boolean isBuildable(Position ps) {
        return GasStation.isBuildable(ps);
    }

    /* GasStaion 메서드 구현 */
    @Override
    public int beExtracted() { return g.beExtracted(); }
}