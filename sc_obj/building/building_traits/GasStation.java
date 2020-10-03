package sc_obj.building.building_traits;

import sc_obj.*;
import sc_obj.resource.Gas;

public interface GasStation {

    /* 건물을 지을 수 있는 위치인지 알려주는 메서드 
       가스 위에만 건설할 수 있는 GasStaion의 isBuildable 규칙
       리파이너리, 어시밀레이터, 익스트레터 만 이 규칙을 따른다. */
    static boolean isBuildable(Position ps) {    
        /* 가스 위에서만 지을 수 있도록 해야 함 */
        System.out.println("GasStation의 isBuildable");
        return true;
    }

    int beExtracted();                  // 가스 추출되기 메서드 (기본 8 감소, 고갈되면 2 감소)
    Gas getGasResource();
}