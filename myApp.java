// {10,11,12,13,14,15,16};

public class myApp {
    public static void main(String args[]) {
        Colection colection = new Colection();
        System.out.println("------------------Sequencial Search---------------------------");
        System.out.println("Position of the element 23 = " + colection.sequentialSearch(23));
        System.out.println("Position of the element 12 = " + colection.sequentialSearch(12));
        System.out.println("Position of the element 76 = " + colection.sequentialSearch(76));
        System.out.println("Position of the element 99 = " + colection.sequentialSearch(99));
        System.out.println("\n\n");
        System.out.println("------------------Binary Search---------------------------");
        System.out.println("Position of the element 23 = " + colection.binarySearch(23));
        System.out.println("Position of the element 13 = " + colection.binarySearch(12));
        System.out.println("Position of the element 76 = " + colection.sequentialSearch(76));
        System.out.println("Position of the element 99 = " + colection.binarySearch(99));
    }
};