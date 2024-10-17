package ExamPrep_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         List<String> products  = Arrays.stream(scanner.nextLine().split("!"))
                                  .collect(Collectors.toList());

         String command = scanner.nextLine();

         while(!command.equals("Go Shopping!")){
             String [] currentTokens = command.split(" ");
             String commandName = currentTokens[0];
             String item = currentTokens[1];

             //•	Urgent {item} - add the item at the start of the list.  If the item already exists, skip this command.
             //•	Unnecessary {item} - remove the item with the given name, only if it exists in the list. Otherwise skip this command.
             //•	Correct {oldItem} {newItem} – if the item with the given old name exists, change its name with the new one. If it doesn't exist, skip this command.
             //•	Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the end of the list.

             switch (commandName){
                 case "Urgent":
                     if(!checkIfItemExist(products, item)){
                         products.add(0, item);
                     }
                     break;
                 case "Unnecessary":
                     if(checkIfItemExist(products, item)){
                         products.remove(item);
                     }
                     break;
                 case "Correct":
                     String newItem = currentTokens[2];
                     if(checkIfItemExist(products, item)){
                         int index = products.indexOf(item);
                         products.set(index, newItem);
                     }
                     break;
                 case "Rearrange":
                     if(checkIfItemExist(products, item)){
                         products.remove(item);
                         products.add(item);
                     }
                     break;
             }
             command = scanner.nextLine();
         }
        System.out.println(String.join(", ", products));
    }
    private static boolean checkIfItemExist(List<String> products, String item) {
        for(String product : products){
            if(product.equals(item)){
                return true;
            }
        }
        return false;
    }
}
