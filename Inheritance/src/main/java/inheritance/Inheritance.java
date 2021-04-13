/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import monsters.Monster;
import monsters.Skeleton;

/**
 *
 * @author ilhom
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Monster monster = new Monster(100, 10);
//        
//        monster.attack();
//        
//        System.out.println(monster.hitPoints);
//        System.out.println(monster.speed);

        Skeleton skeleton = new Skeleton(1000, 500);
        Skeleton skeleton2 = new Skeleton(1000, 500, "Bow");
        
        System.out.println(skeleton.hitPoints);
        System.out.println(skeleton2.typeOfAttack);
        skeleton.attack();
        
    }
    
}
