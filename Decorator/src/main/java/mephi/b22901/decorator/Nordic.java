/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

/**
 *
 * @author ivis2
 */
public class Nordic extends DishDecorator {
    public Nordic(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Норвежская лепешка";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 7;
    }
}

