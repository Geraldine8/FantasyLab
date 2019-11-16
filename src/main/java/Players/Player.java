package Players;

public abstract class Player {

    private int healthPoints;
    private String name;

    public Player(int healthPoints, String name) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void getHealth(int value){
        this.healthPoints += value;
    }
}

