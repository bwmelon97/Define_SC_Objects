package sc_obj.building.building_traits;

import sc_obj.*;
import sc_obj.building.Building;

public interface Addon {
    
    Size ADDON_SIZE = new Size(20, 20);

    /* 건물을 지을 수 있는 지 여부를 알려주는 메서드
       Addon 건물은 해당 본 건물 우측 옆에만 지을 수 있음 */
    static boolean isBuildable (Position ps) {
        return Building.isBuildable(ps, ADDON_SIZE) /* && 해당 건물 우측인지 */ ;
    }
}