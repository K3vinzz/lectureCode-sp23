package lec11_inheritance3;

import java.util.Comparator;

public class DogLauncher {
    public static void main(String args[]){
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);

        Dog[] dogs = new Dog[]{d1, d2, d3};
        Dog d = (Dog)Maximizer.max(dogs);
        System.out.println(d.name);
        d.bark();
        Comparator<Dog> nc = Dog.getNameComparator();
        if (nc.compare(d1, d3) > 0){ // if d1 comes later than d3 in alphabet
            d1.bark();
        } else{
            d3.bark();
        }
    }
}