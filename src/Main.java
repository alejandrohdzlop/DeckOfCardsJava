public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Mezclar el deck
        deck.shuffle();

        // Mostrar la primera carta del deck
        deck.head();

        // Seleccionar una carta al azar
        deck.pick();

        // Obtener una mano de 5 cartas
        deck.hand();
    }
}
