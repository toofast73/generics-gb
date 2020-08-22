package ru.gb;

public class BoxWithNumbers<T extends Number> {

    public T[] objects;

    public BoxWithNumbers(T... objects) {
        this.objects = objects;
    }

    public void putByIndex(T obj, int index){
        objects[index] = obj;
    }

    public T getByIndex(int index){
        return objects[index];
    }

    public double average(){
        double sum = 0;
        for (T object : objects) {
            sum += object.doubleValue();
        }

        return sum / objects.length;
    }


    public boolean compare(BoxWithNumbers<?> other){
        return average() > other.average();
    }

}
