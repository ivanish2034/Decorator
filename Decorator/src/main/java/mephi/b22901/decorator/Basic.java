/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public class Basic implements Dish {
    @Override
    public String getName() {
        return "Рагу";
    }

    @Override
    public int getPrice() {
        return 50;
    }
    
    @Override
    public void execute() {
        System.out.println("Готовится базовое рагу...");
    }
}

