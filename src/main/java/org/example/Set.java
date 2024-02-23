package org.example;

public class Set<T> {
    private Object[] array = new Object[10];
    private int size;

    public void add(T a) throws EmptyElementException {
        if (size != 0) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (a.toString().equals(array[i].toString())){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                if (a == null){
                    throw new EmptyElementException();
                } else if (size < array.length){
                    array[size] = a;
                    size+=1;
                } else {
                    Object[] temp = new Object[array.length + 10];
                    for (int i = 0; i < array.length; i++){
                        temp[i] = array[i];
                    }
                    array = temp;
                    array[size] = a;
                    size+=1;
                }
            }
        } else if (size == 0){
            array[size] = a;
            size++;
        }
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public T[] asList(){
        return (T[]) array;
    }
    public void delete(T a){
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (a.toString().equals(array[i].toString())){
                index = i;
                flag = true;
            }
        }
        if (flag) {
            array[index] = array[size-1];
            array[size-1] = null;
            Object[] temp = new Object[array.length-1];
            for (int i = 0; i < array.length-1; i++) {
                temp[i] = array[i];
            }
            array = temp;
            size--;
        }
    }
    public boolean contains(T temp){
        for (int i = 0; i < size; i++) {
            if (temp.toString().equals(array[i].toString())){
                return true;
            }
        }
        return false;
    }
}
