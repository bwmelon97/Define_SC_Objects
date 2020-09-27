package sc_obj.unit;

public class Unit {
    private final int population;
    private final int moveSpeed;

    public Unit(final int population, final int moveSpeed) {
        this.population = population;
        this.moveSpeed = moveSpeed;
    }

    public int getPopulation() { return population; }
    public int getMoveSpeed() { return moveSpeed; }

    public void move() {

    }

    public void stop() {
        
    }
}