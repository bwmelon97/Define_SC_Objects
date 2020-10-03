package sc_obj.building.building_traits;

import sc_obj.building.building_traits.GasStation;
import sc_obj.resource.Gas;

public class GasStationImpl implements GasStation {
    
    private final Gas gasResource;

    public GasStationImpl( Gas gasResource ) {
        this.gasResource = gasResource;
    }

    /* 연결된 가스 자원 객체를 리턴하는 메서드 */
    @Override
    public Gas getGasResource() { return this.gasResource; }

    /* 가스 추출되기 메서드 */
    @Override
    public int beExtracted() { return this.gasResource.beExtracted(); }
}