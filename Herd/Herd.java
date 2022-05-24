package Herd;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Moveable{

    private int x;
    private int y;
    private List<Moveable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    public String toString(){
        StringBuilder organisms = new StringBuilder();
        for(Moveable organism: herd){
            organisms.append(organism.toString()).append("\n");
        }
        return organisms.toString();
    }

    public void addToHerd(Moveable moveable){
        this.herd.add(moveable);
    }

    @Override
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

}
