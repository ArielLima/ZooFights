package zoo;

import java.lang.Math;

class Animal {
    // Class variables
    int attackPower = 25;
    int health = 100;
    int defense = 50;
    int speed = 25;

    public int attack() {
        return (int)(Math.random() * ((attackPower - (attackPower/2)) + 1));
    }
    public void receiveDamage(int damage){
        this.health = damage - (int)(Math.random() * (this.defense));
    }
}