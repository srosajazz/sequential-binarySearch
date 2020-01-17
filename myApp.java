// {10,11,12,13,14,15,16};

public class myApp {
    public static void main(String args[]) {
        Colection colection = new Colection();
        System.out.println("Position of the element 12 = " + colection.sequentialSearch(12));
        System.out.println("Position of the element 16 = " + colection.sequentialSearch(16));
        System.out.println("Position of the element 13 = " + colection.sequentialSearch(13));
        System.out.println("Position of the element 99 = " + -colection.sequentialSearch(99));
    }
}