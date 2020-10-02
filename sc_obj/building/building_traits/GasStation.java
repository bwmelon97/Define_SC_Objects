package sc_obj.building.building_traits;

import sc_obj.*;

public interface GasStation {

    /* 건물을 지을 수 있는 위치인지 알려주는 메서드 */
    static boolean isBuildable(Position ps, Size size) {    
        /* 가스 위에서만 지을 수 있도록 해야 함 */
        return true;
    }

    int beExtracted();                  // 가스 추출되기 메서드 (기본 8 감소, 고갈되면 2 감소)
}