/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public abstract class DishDecorator implements Dish {
    protected Dish dish;

    public DishDecorator(Dish dish) {
        this.dish = dish;
    }
    
    @Override
    public void execute() {
        dish.execute(); 
    }
}

