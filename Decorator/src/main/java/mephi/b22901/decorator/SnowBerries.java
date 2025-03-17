/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public class SnowBerries extends DishDecorator {
    public SnowBerries(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Снежные ягоды";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 5;
    }
    
    @Override
    public void execute() {
        dish.execute();
        getPrice();
        
    }
}
