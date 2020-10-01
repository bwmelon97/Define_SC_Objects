package sc_obj.unit.unit_traits;

import java.util.ArrayList;
import sc_obj.building.Building;
import sc_obj.resource.Resource;

public interface Worker {
    ArrayList<Building> buildingList = new ArrayList<>();

    void gatherResource( Resource resource );
    void build();
}