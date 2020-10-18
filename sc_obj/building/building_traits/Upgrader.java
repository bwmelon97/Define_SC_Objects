package sc_obj.building.building_traits;

import java.util.ArrayList;

import non_obj.upgrade.Upgrade;

public interface Upgrader {
    void upgrade(/* Commander commander , */ Upgrade upgrade);    // 업그레이드 메서드
    ArrayList<Upgrade> getUpgradeList();
    // void addUpgradeList(Upgrade upgrade);
}