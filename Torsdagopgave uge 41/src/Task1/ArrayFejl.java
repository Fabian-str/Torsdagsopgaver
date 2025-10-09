package Task1;

public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {
        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hovsa! Der gik noget galt. Her er en brugervenlig fejlbesked: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        printTreForsteElementer(navne1);
        printTreForsteElementer(navne2);
    }
}