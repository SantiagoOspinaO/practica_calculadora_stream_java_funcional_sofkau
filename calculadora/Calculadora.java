package calculadora;

import java.util.logging.Logger;
import java.util.stream.IntStream;

import javax.lang.model.element.Element;

import java.util.Arrays;
import java.util.List;

public class Calculadora {

    private static final Logger logger = Logger.getLogger("Logger");

    List<Integer> numbersA = Arrays.asList(12, 9, 12, 4, 27, 18);
    List<Integer> numbersB = Arrays.asList(6, 7, 8, 3, 0, 3);

    public void sumar() {
        if (numbersA.size() == numbersB.size()) {
            var suma = IntStream.range(0, numbersA.size())
                    .filter(element -> element > 3)
                    .mapToObj(index -> (numbersA.get(index) + numbersB.get(index)))
                    .toList();

            var response = "suma = " + suma.toString();
            logger.info(response);
        } else {
            logger.info("Error, tamaños diferentes");
        }
    }

    public void restar() {
        if (numbersA.size() == numbersB.size()) {
            var resta = IntStream.range(0, numbersA.size())
                    .limit(2)
                    .mapToObj(index -> (numbersA.get(index) - numbersB.get(index)))
                    .toList();

            var response = "resta = " + resta.toString();
            logger.info(response);
        } else {
            logger.info("Error, tamaños diferentes");
        }
    }

    public void multiplicar() {
        if (numbersA.size() == numbersB.size()) {
            var multiplicacion = IntStream.range(0, numbersA.size())
                    .distinct()
                    .mapToObj(index -> (numbersA.get(index) * numbersB.get(index)))
                    .toList();

            var response = "multiplicacion = " + multiplicacion.toString();
            logger.info(response);
        } else {
            logger.info("Error, tamaños diferentes");
        }
    }

    public void dividir() {
        if (numbersA.size() == numbersB.size()) {
            var divicion = IntStream.range(0, numbersA.size())
                .filter(element -> element > 2)
                .mapToObj(index -> {
                    if (!numbersB.get(index).equals(0)) {
                        return (numbersA.get(index) / numbersB.get(index));
                    } else {
                        return "Indeterminado";
                    }
                }).toList();

            var response = "divicion = " + divicion.toString();
            logger.info(response);
        } else {
            logger.info("Error, tamaños diferentes");
        }
    }

    public void modulo() {
        if (numbersA.size() == numbersB.size()) {
            var modulo = IntStream.range(0, numbersA.size())
                .skip(2)
                .mapToObj(index -> {
                    if (!numbersB.get(index).equals(0)) {
                        return (numbersA.get(index) % numbersB.get(index));
                    } else {
                        return "Indeterminado";
                    }
            }).toList();

            var response = "modulo = " + modulo.toString();
            logger.info(response);
        } else {
            logger.info("Error, tamaños diferentes");
        }
    }
}