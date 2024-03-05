package es.uah.matcomp.mp.e1.AgregacionComposicion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(1,1,3,1,4,3);
        String mensajeEsperado = "MyTriangle[v1=(1,1), v2=(3,1), v3=(4,3)]";
        String mensajeObtenido = triangle.toString();
        Assertions.assertEquals(mensajeEsperado, mensajeObtenido);
    }
    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(1,1,3,1,4,3);
        double perimetroEsperado = 2+ Math.sqrt(13) + Math.sqrt(5);
        double perimetroObtenido = triangle.getPerimeter();
        Assertions.assertEquals(perimetroEsperado ,perimetroObtenido);
    }

    @Test
    void getType() {
        String equilatero = "Equilateral";
        String escaleno = "Scalene";
        String isosceles = "Isosceles";
        MyTriangle triangleIsosceles = new MyTriangle(3,2,7,1,4,6);
        Assertions.assertEquals(isosceles, triangleIsosceles.getType());
        MyTriangle triangleEscaleno = new MyTriangle(2,1,7,1,4,4);
        Assertions.assertEquals(escaleno, triangleEscaleno.getType());
        /* Para comprobar el triángulo equilatero no hemos encontrado ningun tríangulo equilátero en el que todas las coordenadas
        de sus vértices sean números enteros(int).
         */
    }
}