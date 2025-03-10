public class TestGenerics4 {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'j', 'A', 'V', 'A'};
        System.out.println("Printing integer array:");
        printArray(intArray);
        System.out.println("Printing character array:");
        printArray(charArray);
    }
}