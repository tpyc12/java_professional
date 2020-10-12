package hw1;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {

        Box<Apple> boxApple = new Box<>(new Apple(),new Apple(), new Apple());
        Box<Orange> boxOrange = new Box<>(new Orange(), new Orange());
        Box<Orange> boxOrange2 = new Box<>();

        System.out.println(boxApple.getWeight());
        boxOrange2.someAvg(boxOrange);
        boxOrange.transfer(boxOrange2);
        System.out.println(boxOrange2.getWeight());


//
//        Integer[] iArray = new Integer[10];
//        String[] sArray = new String[iArray.length];
//
//
//        for (int i = 0; i < iArray.length; i++) {
//            iArray[i] = i;
//            sArray[i] = "Значение" + i;
//        }
//
//        try {
//            changeTheElementsOfTheArray(iArray, 2, 8);
//            changeTheElementsOfTheArray(sArray, 8, 2);
//        }catch (WrongPositionException e){
//            e.printStackTrace();
//        }
//
//        System.out.println(Arrays.asList(iArray));
//        System.out.println(Arrays.asList(sArray));
//
//        arrayToList(iArray);
//        arrayToList(sArray);
//
//        System.out.println(Arrays.asList(iArray));
//        System.out.println(Arrays.asList(sArray));
    }

    private static void changeTheElementsOfTheArray (Object[] arr, int a, int b) throws WrongPositionException {
        Object c;
        a-=1;
        b-=1;
        if (a < 0 || a > arr.length || b < 0 || b > arr.length){
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }else{
            c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
        }
    }

    private static <T> ArrayList<T> arrayToList(T [] arr) {
       return new ArrayList<>(Arrays.asList(arr));
    }
}
