package sc_obj.common_traits;

import java.util.ArrayList;

import sc_obj.unit.Unit;

public interface Producer {
    ArrayList<Unit> productList = new ArrayList<Unit>();    // 생산 가능한 유닛 리스트
    void produce(/* Commander commander , */ Unit unit);    // 유닛 생산 메서드
}