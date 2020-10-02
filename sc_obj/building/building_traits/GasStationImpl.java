package sc_obj.building.building_traits;

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
}