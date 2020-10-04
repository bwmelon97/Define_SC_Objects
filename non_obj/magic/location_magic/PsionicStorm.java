/* 사이오닉 스톰 */

package non_obj.magic.location_magic;

import non_obj.magic.location_magic.LocationMagic;

public class PsionicStorm extends LocationMagic {
    public static final int ENERGY_COST = 75;
    public static final int RANGE = 80;

    public PsionicStorm () {
        super(ENERGY_COST);
    }
}