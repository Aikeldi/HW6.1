package com.company;

public class GameEntity {

    public int health;
    public int damage;
    public String defOrDamType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefOrDamType() {
        return defOrDamType;
    }

    public void setDefOrDamType(String defOrDamType) {
        this.defOrDamType = defOrDamType;
    }
}
