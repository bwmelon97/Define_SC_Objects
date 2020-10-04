package sc_obj.common_traits;

import java.util.ArrayList;

import non_obj.magic.Magic;
import sc_obj.common_traits.Magician;

public class MagicianImpl implements Magician {
    
    private int curMP;      // 현재 MP
    
    /* 사용 가능한 마법 리스트 */
    private ArrayList<Magic> magicList = new ArrayList<Magic>();

    /* Constructor */
    public MagicianImpl() {
        this.curMP = 50;
    }

    @Override
    public int getCurMP() { return curMP; }

    @Override
    public ArrayList<Magic> getMagicList() { return this.magicList; }

    @Override
    public void addMagicList(Magic magic) { this.magicList.add(magic); }

    @Override
    public void fillMP() {
        /* 마나를 자동으로 채우는 메서드 */
    }

    @Override
    public boolean useMagic(Magic magic) {
        
        /* 사용 가능한 마법이 아닌 경우 */
        if ( !this.magicList.contains(magic) ) {
            System.out.println("해당 마법은 사용할 수 없습니다.");
            return false;
        }

        /* 마나가 부족한 경우 */
        if ( this.curMP < magic.getENERGY_COST() ) {
            System.out.println("마나가 부족합니다.");
            return false;
        }

        /* 마법 사용 !! */
        return true;
    }
}