package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtrai(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplica(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double divide(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) numero1 / numero2;
    }
}
