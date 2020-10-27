package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(700);
        boss.setDefOrDamType("Physical");
        boss.setNameOfWeapon("Desert Eagle");
        boss.setTypeOfWeapon("Pistol");
        System.out.println(boss.getDamage() + " " + boss.getHealth() + " " + boss.getDefOrDamType()+ " "
                + boss.getNameOfWeapon() + " " + boss.getTypeOfWeapon());
    }
}
