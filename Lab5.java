public class Lab5 {
    public static void main(String[] args) {
        MyArray ma = new MyArray(5);
        ma.getInput();
        ma.displayArray();
        System.out.println("Doubled Elements are : ");
        ma.doubleElements();
        ma.displayArray();
        System.out.println(" Doubled Size and Elements are : ");
        ma.doubleSize();
        ma.displayArray();
    }
}
