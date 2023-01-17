import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayCha {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> grocerious = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(grocerious);
                case 2 -> removeItems(grocerious);

                default -> flag =false;
            }
            grocerious.sort(Comparator.naturalOrder());
            System.out.println(grocerious);

        }
    }
    private static  void addItems(ArrayList<String> groceries){
        System.out.println("Add item :");
        String [] items = scanner.nextLine().split(",");
        groceries.addAll(List.of(items));
        for (String i:items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static  void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item :");
        String [] items = scanner.nextLine().split(",");

        for (String i:items){
            String trimmed = i.trim();
                groceries.remove(trimmed);

        }
    }
    private static void printActions(){
        String textBlock = """
                0, 1 , 2 : 
                """;
        System.out.println(textBlock + " ");
    }
}
