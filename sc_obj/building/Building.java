package sc_obj.building;

import sc_obj.*;

public class Building extends SC_Object {
    public Building (final int MAX_HP, final ProducingCost pc, final Position ps, final Size size) {
        super( MAX_HP, pc, ps, size );
    }
}