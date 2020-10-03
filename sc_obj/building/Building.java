package sc_obj.building;

import sc_obj.*;

public class Building extends SC_Object {
    public Building ( final Position ps ) {
        super(ps);
    }

    /* 건물을 지을 수 있는 지 없는 지를 알려주는 메서드 
       특수 케이스 (가스, 프로토스, 저그 등)를 제외한 기본 건물들의 isBuildable 규칙 */
    public static boolean isBuildable( Position ps, Size size ) {
        System.out.println("Building의 isbuildable");
        return true;
    }
}