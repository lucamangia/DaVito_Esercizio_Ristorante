//Classe contenente il Main del progetto, dove gestire la stampa del menù
public class Menu {
    public static void main(String[] args) {

        //Header del menù
        System.out.println("\n-------------- MENÙ --------------\n");

        //Stampa del menù dei dessert
        System.out.println("\nDESSERT -----\n");
        Dessert[] dessertMenu = DessertMenu.getDessertMenu();
        for (Dessert dessert : dessertMenu) {
            System.out.println(dessert);
            System.out.println("\n-------------\n");
        }

    }
}
