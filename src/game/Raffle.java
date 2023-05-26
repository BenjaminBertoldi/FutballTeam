package game;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Raffle <T> {
    private int rnd(){
        return random.nextInt(elements.size());
    }
    private void checkEmptyness(){
        if (isEmpty()){
            throw new NoSuchElementException("Raffle is Empty");
        }
    }
    private ArrayList<T> elements;
    private Random random;

    public Raffle() {
        this.elements = new ArrayList<>();
        this.random = new Random();
    }

    public void add (T element){
        elements.add(element);
    }
    public T get (){
        checkEmptyness();
        return elements.get(rnd());
    }
    public T remove (){
        checkEmptyness();
        return elements.remove(rnd());
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public void addAll (ArrayList<T> list){
        elements.addAll(list);
    }
}
