package sc_obj.building.building_traits;

import sc_obj.*;

public interface GasStation {
    int beExtracted();                  // 가스 추출되기 메서드 (기본 8 감소, 고갈되면 2 감소)
    boolean isBuildable(Position ps);   // 해당 위치에 건물을 지을 수 있는지 (가스 스테이션은 가스 위에만 건설 가능)
}