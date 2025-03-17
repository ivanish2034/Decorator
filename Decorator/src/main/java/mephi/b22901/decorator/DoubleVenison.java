/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public class DoubleVenison extends DishDecorator {
    public DoubleVenison(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Двойная порция оленины";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 20;
    }
    
    @Override
    public void execute() {
        dish.execute();
        getPrice();
        
        System.out.println("Добавляется двойная порция оленины...");
    }
}

