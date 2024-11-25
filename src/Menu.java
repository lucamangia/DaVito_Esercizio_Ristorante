public class Menu {
    public static void main(String[] args) {

        System.out.println("\n-------------- MENÙ --------------\n");

        System.out.println("\nDESSERT -----\n");
        Dessert[] dessertMenu = DessertMenu.getDessertMenu();
        for (Dessert dessert : dessertMenu) {
            System.out.println(dessert);
            System.out.println("\n-------------\n");
        }

    }
}
