package calculadora;

import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;

public class Calculadora {

    private static final Logger logger = Logger.getLogger("Logger");

    List<Integer> numbersA = Arrays.asList(12, 9, 12, 4, 27);
    List<Integer> numbersB = Arrays.asList(6, 7, 8, 3, 3);

    public void sumar() {

        var suma = IntStream.range(0, numbersA.size())
                .mapToObj(index -> (numbersA.get(index) + numbersB.get(index)))
                .toList();

        var response = "suma = " + suma.toString();
        logger.info(response);
    }

    public void restar() {

        var resta = IntStream.range(0, numbersA.size())
                .mapToObj(index -> (numbersA.get(index) - numbersB.get(index)))
                .toList();

        var response = "resta = " + resta.toString();
        logger.info(response);
    }

    public void multiplicar() {

        var multiplicacion = IntStream.range(0, numbersA.size())
                .mapToObj(index -> (numbersA.get(index) * numbersB.get(index)))
                .toList();

        var response = "multiplicacion = " + multiplicacion.toString();
        logger.info(response);
    }

    public void dividir() {

        var divicion = IntStream.range(0, numbersA.size()).mapToObj(index -> {

            if (!numbersB.get(index).equals(0)) {
                return (numbersA.get(index) / numbersB.get(index));
            } else {
                return "Indeterminado";
            }

        }).toList();

        var response = "divicion = " + divicion.toString();
        logger.info(response);
    }

    public void modulo() {

        var modulo = IntStream.range(0, numbersA.size()).mapToObj(index -> {

            if (!numbersB.get(index).equals(0)) {
                return (numbersA.get(index) % numbersB.get(index));
            } else {
                return "Indeterminado";
            }

        }).toList();

        var response = "modulo = " + modulo.toString();
        logger.info(response);
    }
}