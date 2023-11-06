package lec11_inheritance3;

import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    public String name;
    private int size;
    public Dog(String n, int s){
        name = n;
        size = s;
    }

    @Override
    public int compareTo(Dog o) {
        return size - o.size;
    }

    private static class NameComparator implements Comparator<Dog>{
        @Override
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name); // The compareTo() is String.compareTo(), which compares two strings lexicographically.
        }
    }

    public static Comparator<Dog> getNameComparator(){
        return new NameComparator();
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

}
