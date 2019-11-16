package Enemies;

public abstract class Enemy {

    private int healthPoints;

    public Enemy (int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int takeDamage(int damage){
        return this.healthPoints -= damage;
    }


    public int getHealthPoints() {
        return this.healthPoints;
    }
}
