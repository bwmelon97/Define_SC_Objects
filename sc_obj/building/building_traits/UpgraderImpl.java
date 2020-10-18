package sc_obj.building.building_traits;

import java.util.ArrayList;

import non_obj.upgrade.Upgrade;
import sc_obj.building.building_traits.Upgrader;

public class UpgraderImpl implements Upgrader {
    
    /* 가능한 업그레이드 리스트 */
    ArrayList<Upgrade> upgradeList = new ArrayList<Upgrade>();    
    
    @Override
    public ArrayList<Upgrade> getUpgradeList() { return this.upgradeList; }

    // @Override
    public void addUpgradeList(Upgrade upgrade) { this.upgradeList.add(upgrade); }

    @Override
    public void upgrade(Upgrade upgrade) {
        
    }
}