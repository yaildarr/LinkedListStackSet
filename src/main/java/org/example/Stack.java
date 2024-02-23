package org.example;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Stack<T> {

    private Object[] array = new Object[10];
    private int size;

    public void push(T a) throws EmptyElementException {
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
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public int size() {
        return this.size;
    }

    public T pop(){
        Object[] result = new Object[array.length - 1];
        T last = (T) array[size-1];
        for (var i = 0; i < array.length; i++) {
            if (i != size-1) { // Копируем все кроме index
                // Элементы стоящие дальше index смещаются влево
                var newIndex = i < size-1 ? i : i - 1;
                result[newIndex] = array[i];
            }

        }
        array = result;
        size--;
        return last;
    }
}
