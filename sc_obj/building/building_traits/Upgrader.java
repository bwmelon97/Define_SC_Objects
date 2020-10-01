package sc_obj.building.building_traits;

import java.util.ArrayList;

import upgrade.Upgrade;

public interface Upgrader {
    ArrayList<Upgrade> upgradeList = new ArrayList<Upgrade>();    // 가능한 업그레이드 리스트
    void produce(/* Commander commander , */ Upgrade upgrade);    // 업그레이드 메서드
}