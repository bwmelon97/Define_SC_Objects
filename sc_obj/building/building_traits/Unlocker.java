package sc_obj.building.building_traits;

import java.util.ArrayList;

public interface Unlocker {
    ArrayList<Object> unlockList = new ArrayList<Object>();     // 잠금을 풀 수 있는 리스트 (나중에 Object 대신, SC_Object와 Upgrade를 묶는 객체 생성 필요)
    void unlock(/* Commander commander */);
}