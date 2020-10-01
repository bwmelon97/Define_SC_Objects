package sc_obj.common_traits;

public interface Magician {
    void fillMP();              // 마나 채우기 메서드 (자동 충전)
    boolean useMP(int gauge);   // 마나 사용 메서드 (사용한 경우 true, 부족한 경우 false 리턴)
}