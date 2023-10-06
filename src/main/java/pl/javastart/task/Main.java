package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList();
        CustomList<Integer> customListOfIntegers = new CustomList();

        //Testowanie customListOfIntegers
        customListOfIntegers.add(1);
        customListOfIntegers.add(2);
        customListOfIntegers.add(3);

        System.out.println("List: " + customListOfIntegers);
        System.out.println("Size: " + customListOfIntegers.size());

        customListOfIntegers.add(1, 4);
        System.out.println("After adding at index 1: " + customListOfIntegers);

        customListOfIntegers.remove(2);
        System.out.println("After removing at index 2: " + customListOfIntegers);

        int elementInt = customListOfIntegers.get(2);
        System.out.println("Element at index 2: " + elementInt);

        // Testowanie customListOfStrings
        customListOfStrings.add("One");
        customListOfStrings.add("Two");
        customListOfStrings.add("Three");

        System.out.println("List: " + customListOfStrings);
        System.out.println("Size: " + customListOfStrings.size());

        customListOfStrings.add(1, "Four");
        System.out.println("After adding at index 1: " + customListOfStrings);

        customListOfIntegers.remove(2);
        System.out.println("After removing at index 2: " + customListOfStrings);

        String elementString = customListOfStrings.get(2);
        System.out.println("Element at index 2: " + elementString);

    }

}
