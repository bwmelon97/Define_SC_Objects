/* 컴셋의 스캔 */

package non_obj.magic.location_magic;

import non_obj.magic.location_magic.LocationMagic;

public final class ScannerSweep extends LocationMagic {
    public static final int ENERGY_COST = 50;
    public static final int RANGE = 9999;   // 맵 전체 사용 가능

    public ScannerSweep () {
        super(ENERGY_COST);
    }
}