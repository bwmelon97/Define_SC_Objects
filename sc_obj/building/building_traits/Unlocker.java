package sc_obj.building.building_traits;

import java.util.ArrayList;

public interface Unlocker {
    void unlock(/* Commander commander */ Object o );
    ArrayList<Object> getUnlockList();
}