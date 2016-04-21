import java.util.*;
 
public class HW7
{
    public static void main(String[] args)
    {
         ArrayList <String> shoppingList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scanL = new Scanner(System.in);
        String listitem;
        int selectedOption=0;
        System.out.println("Welcome to the shopping list program! What would you like to do?");
        do
        {
        System.out.println("Enter a an option to continue, enter 7 to exit: ");
        System.out.println("Enter 1 to Show the shopping list"); 
        System.out.println("Enter 2 to Add a new item to the back of the list");
        System.out.println("Enter 3 to Remove an specific item from the list");
        System.out.println("Enter 4 to Insert an item to the list");
        System.out.println("Enter 5 to Change an item in the list");
        System.out.println("Enter 6 to Clear all the items of the list");
        selectedOption = scan.nextInt();
           switch (selectedOption)
           
           {
 
                case 1:
                if( ! shoppingList.isEmpty())
                {
                    System.out.println("The items in the list are: ");
 
                    for(int i = 0; i < shoppingList.size(); i++)
                    {
                     int indexOutput = i+1;
 
                     System.out.println(indexOutput + ". " + shoppingList.get(i) );
 
 
                    } 
 
                }
                else
                {
                    System.out.println("No items");
                }
                break;
 
                case 2:
                {
                System.out.println("What item would you like to add?: ");
                shoppingList.add(scanL.nextLine());
                break;
                }
 
                case 3:
                System.out.println("Which item would you like to remove from the list? Enter the position number for that item: ");
                int removedItemLocation = scan.nextInt();
                if( removedItemLocation>0 && removedItemLocation<=shoppingList.size())
                {                   
                    shoppingList.remove(removedItemLocation - 1);
                }
                else
                {
                    System.out.println("theres nothing there");
                }                
                break;
                
               case 4:              
               System.out.println("Where would you want to insert the item, and what would you want to insert ");
               int insertedItemLocation = scan.nextInt();
               if( insertedItemLocation>0 && insertedItemLocation<=shoppingList.size())
                {                    
                    shoppingList.add(insertedItemLocation -1, scanL.nextLine());
                }
                else
                {
                    System.out.println("stay within bounds");
                }
               break;
               
               case 5:
               System.out.println("What item would you like to change?: ");
                int changedItemLocation = scan.nextInt();
                if( changedItemLocation>0 && changedItemLocation<=shoppingList.size())
                {                    
                    shoppingList.set(changedItemLocation, scanL.nextLine());
                }
                else
                {
                    System.out.println("theres nothing there");
                }               
               break;
               
               case 6:             
               shoppingList.clear();
               break;
            }
            
        }
        while (selectedOption != 7);
   }
}