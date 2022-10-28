import static java.lang.Math.PI;

public class Funciones {
    public void mostrarMenu(){
        System.out.println("Muestro menu");
    }

    public int introducirOpcion(){
        // pide opcion al usuario

        return 1;
    }

    public int introducirNumero(){
        // pide numero
        int numero = 5;
        return numero;
    }

    public void mostrarArea(int area) {
        System.out.println(area);
    }

    public int calcularAreaCuadrado(int lado) {
        return lado*lado;
    }

    public int calcularAreaTriangulo(int base, int altura) {
        return base*altura/2;
    }

    public double calcularAreaCircunferencia(int radio) {
        return PI*radio*radio;
    }

    public void mostrarMensaje() {
        System.out.println("Error");
    }
}
