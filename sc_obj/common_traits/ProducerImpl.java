package sc_obj.common_traits;

import java.util.ArrayList;

import sc_obj.common_traits.Producer;
import sc_obj.unit.Unit;

public class ProducerImpl implements Producer {
    
    private ArrayList<Unit> productList = new ArrayList<Unit>();    // 생산 가능한 유닛 리스트
    
    public ArrayList<Unit> getProductList() { return productList; }

    public void addProductList(Unit unit) {
        this.productList.add(unit);
    }

    @Override
    public void produce(Unit unit) {
        
        /* 생산 가능한 리스트에 없는 유닛인 경우 바로 리턴 */
        if( !this.productList.contains(unit) ) {     // if 문 수정해야할 꺼 같은 느낌
            System.out.println("해당 유닛은 생산할 수 없습니다.");
            return;
        }

        /* Produce 구현 */    
    }
}