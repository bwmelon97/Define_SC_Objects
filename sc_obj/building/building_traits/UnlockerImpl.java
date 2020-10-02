package sc_obj.building.building_traits;

import java.util.ArrayList;

import sc_obj.building.building_traits.Unlocker;

public class UnlockerImpl implements Unlocker {
    
    private ArrayList<Object> unlockList = new ArrayList<Object>();     // 잠금을 풀 수 있는 리스트 (나중에 Object 대신, SC_Object와 Upgrade를 묶는 객체 생성 필요)

    public ArrayList<Object> getUnlockList() { return unlockList; }

    public void addUnlockList(Object o) {
        this.unlockList.add(o);
    }

    @Override
    public void unlock( Object o ) {

        /* Unlock 리스트에 없는 유닛인 경우 바로 리턴 */
        if ( !this.unlockList.contains(o) ) {
            System.out.println("해당 오브젝트는 unlock 할 수 없습니다.");
            return;
        }
        /* unlock 구현 */
    }
}