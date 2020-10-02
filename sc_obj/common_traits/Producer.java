package sc_obj.common_traits;

import sc_obj.unit.Unit;

public interface Producer {
    void produce(/* Commander commander , */ Unit unit);    // 유닛 생산 메서드
}