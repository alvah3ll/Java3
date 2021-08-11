package Java3Lesson1.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit>{


    private ArrayList <T> ApOr;


    public Box (T...ApOr){
        this.ApOr = new ArrayList<T>(Arrays.asList(ApOr));

    }
    @SafeVarargs
    public final void add(T... ApOr){
        this.ApOr.addAll(Arrays.asList(ApOr));
    }
    @SafeVarargs
    public final void remove(T... ApOr){
        for (T ApO:ApOr)this.ApOr.remove(ApO);
    }
    public ArrayList<T> getApOr() {
        return new ArrayList<T>(ApOr);
    }

    public float getWeight (){
        if(ApOr.size() == 0) return 0;
        float weight = 0;
        for (T ApO:ApOr) weight += ApO.getWeight();
        return weight;

    }
    public boolean compare (Box box){
        return this.getWeight() ==  box.getWeight();
    }



}
