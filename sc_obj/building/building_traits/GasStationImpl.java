package sc_obj.building.building_traits;

import sc_obj.Position;
import sc_obj.building.building_traits.GasStation;
import sc_obj.resource.Gas;

public class GasStationImpl implements GasStation {
    
    private final Gas gasResource;

    public GasStationImpl( Gas gasResource ) {
        this.gasResource = gasResource;
    }

    public Gas getGasResource() { return gasResource; }

    /* 가스 추출되기 메서드 */
    @Override
    public int beExtracted() {
        return gasResource.beExtracted();
    }

    /* 건물을 지을 수 있는 위치인지 알려주는 메서드 */
    @Override
    public boolean isBuildable(Position ps) {
        /* 가스 위에서만 지을 수 있도록 해야 함 */
        return true;
    }
}