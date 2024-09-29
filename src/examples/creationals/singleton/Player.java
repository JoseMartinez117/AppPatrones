/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.singleton;

/**
 *
 * @author Julian
 */
public class Player {
    private static Player instance;
    private String name;
    
    private Player(String name){
        this.name = name;
    }
    
    public static Player getInstance(String name){
        if (instance == null) {
            instance = new Player(name);
        }
        return instance;
    }
    
    public String toString() {
        return "Player - " + Integer.toHexString(System.identityHashCode(this)) + " - {" +
                "\n name='" + name + '\'' +
                '}';
    }
}
