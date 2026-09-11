public interface Pagavel {
    double calcularSalarioTotal();

    default void imprimirHolerite(){
        System.out.printf(
            "Valor a pagar: %.2f%n", calcularSalarioTotal()
        );
    }
}
