/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public class SpicySauce extends DishDecorator {
    public SpicySauce(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Огненный соус";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 10;
    }
    
    @Override
    public void execute() {
        dish.execute();
        getPrice();
        
    }
}

