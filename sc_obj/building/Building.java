package sc_obj.building;

import sc_obj.*;

public abstract class Building extends SC_Object {
    public Building (final int MAX_HP, final Position ps) {
        super( MAX_HP, ps);
    }

    /* 건물을 지을 수 있는 지 없는 지를 알려주는 메서드 */
    public abstract boolean isBuildable( Position ps );
}