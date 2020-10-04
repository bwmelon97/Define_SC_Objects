package sc_obj.common_traits;

import java.util.ArrayList;

import non_obj.magic.*;

public interface Magician {
    int getCurMP();                     // 현재 마나를 리턴하는 getter Method
    ArrayList<Magic> getMagicList();    // 사용 가능한 마법 리스트를 리턴하는 getter Method
    void addMagicList(Magic magic);     // 마법 리스트에 마법을 추가
    void fillMP();                      // 마나 채우기 메서드 (자동 충전)
    boolean useMagic(Magic magic);      // 마나 사용 메서드 (사용한 경우 true, 부족한 경우 false 리턴)
}