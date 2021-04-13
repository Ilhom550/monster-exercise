/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author ilhom
 */
public class Skeleton extends Monster { //derived class, sub class, child class
    String typeofAttack;
    public boolean typeOfAttack;
    public Skeleton() {
        System.out.println("I'm DEFAULT constructor from Skeleton class");
    }
    public Skeleton(double hitPoints, double speed) {
        super(hitPoints, speed);
        System.out.println("I'm constructor from Skeleton class with 2 arguments");
        typeofAttack = "Axe";
    }
    public Skeleton(double hitPoints, double speed, String typeOfAttack) {
        super(hitPoints, speed);
        System.out.println("I'm constructor from Skeleton class with 2 arguments");
        this.typeofAttack = typeofAttack;
    }
}
