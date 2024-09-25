import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Constructor donde inicializamos las cartas
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colors = {"Rojo", "Negro"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (int i = 0; i < suits.length; i++) {
            for (String value : values) {
                String color = (suits[i].equals("Corazones") || suits[i].equals("Diamantes")) ? colors[0] : colors[1];
                cards.add(new Card(suits[i], color, value));
            }
        }
    }

    // Método para mezclar el deck
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // Método para mostrar la primera carta y removerla
    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    // Método para seleccionar una carta al azar y removerla
    public void pick() {
        if (!cards.isEmpty()) {
            int index = (int) (Math.random() * cards.size());
            Card card = cards.remove(index);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en deck.");
        } else {
            System.out.println("El deck está vacío.");
        }
    }

    // Método para devolver 5 cartas y removerlas del deck
    public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size() + " cartas en deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck.");
        }
    }
}
