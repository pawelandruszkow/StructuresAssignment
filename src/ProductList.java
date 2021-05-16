import java.util.Objects;
import java.util.Scanner;

public class ProductList {

    static SortedLinkedList products = new SortedLinkedList();

    public static void displayProducts() {

        if (products.head == null) {
            System.out.println("\n There are no products to display\n");
            return;
        }

        SortedLinkedList.ListNode currentPos = products.head;

        while (currentPos != null) {
            System.out.println(currentPos.object);
            currentPos = currentPos.next;
        }
    }

    public static void addProduct() {
        String productName;
        String productCode;
        int stock;


        productName = Menu.getString("Enter Product name: ");
        productCode = Menu.getString("Enter Product code: ");
        stock = Menu.getValidNumber("Enter number of stock: ", null);

        Product toInsert = new Product(productName, productCode, stock);

        try {
            products.insert(toInsert);
            System.out.println("\nProduct added to list!\n");
        } catch (SortedADT.NotUniqueException e) {
            System.err.println("This item already exists!");
        }
    }


    public static void removeProducts() {
        if (products.head == null) {
            System.out.println("\n There are no products to remove!\n");
            return;
        }

        SortedLinkedList.ListNode currentPos = products.head;

        String productCode = Menu.getString("Enter Product code to remove: ");

        while (currentPos != null) {
            if (Objects.equals(((Product) currentPos.object).productCode, productCode)) {
                try {
                    products.remove(currentPos.object);
                    System.out.println("\nProduct was removed successfully!\n");
                } catch (SortedADT.NotFoundException e) {
                    System.err.println("Product not found, please enter valid Product Code");
                }
            }
            currentPos = currentPos.next;
        }
    }

}
