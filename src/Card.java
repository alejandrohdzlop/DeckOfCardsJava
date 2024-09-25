public class Card {
    private String suit;  // Palo: tréboles, corazones, picas o diamantes
    private String color; // Color: rojo o negro
    private String value; // Valor: 2-10, A, J, Q, K

    // Constructor
    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    // Método toString para mostrar una carta en el formato deseado
    @Override
    public String toString() {
        return "{" + suit + "}, {" + color + "}, {" + value + "}";
    }
}
