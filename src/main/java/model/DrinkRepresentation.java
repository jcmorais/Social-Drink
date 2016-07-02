package model;

import com.sun.javafx.collections.MappingChange;
import socialdrink.Drink;

import java.util.HashMap;
import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */
public class DrinkRepresentation {
    private int id;
    private String name;
    private String type;
    private String description;
    private int timeToPrepare;

    public DrinkRepresentation(Drink drink){
        this.id = drink.getID();
        this.name = drink.getName();
        this.type = drink.getTypeOfDrink().getName();
        this.description = drink.getDescription();
        this.timeToPrepare = drink.getTimeToPrepate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimeToPrepare() {
        return timeToPrepare;
    }

    public void setTimeToPrepare(int timeToPrepare) {
        this.timeToPrepare = timeToPrepare;
    }

}
