package ArrayRectangulos;

public class Rectangulo {

    private int base,altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return this.altura*this.base;
    }
}
