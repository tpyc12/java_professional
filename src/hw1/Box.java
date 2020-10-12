package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits){
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight(){
        float w = 0.0f;
        for (T fruit :container){
            w+= fruit.getWeight();
        }
        return w;
    }

    public boolean someAvg(Box<?> another){
        return Math.abs(this.getWeight()-another.getWeight())< 0.001f;
    }

    public void transfer(Box <? super T> another){
        if (another == this){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public void add(T fruit){
        container.add(fruit);
    }
}
