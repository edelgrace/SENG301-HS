/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deck;

/**
 *
 * @author Altares
 */
public class Deck {
    private int[] list;
    
    public Deck() {
        list = new int[30];
    }
    
    public int size() {
        return list.length;
    }
}
