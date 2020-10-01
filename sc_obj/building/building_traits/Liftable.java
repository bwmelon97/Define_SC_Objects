package sc_obj.building.building_traits;

public interface Liftable {
    void lift();    // 건물 띄우기 메서드
    void move();    // 건물 움직이기 메서드
    void stop();    // 건물 멈추기 메서드
    void land();    // 건물 착륙하기 메서드
}