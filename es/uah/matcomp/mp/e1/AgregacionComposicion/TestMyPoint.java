package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class TestMyPoint {
    public static void main(String[] args){
        //Se nos pide crear un array de 10 MyPoints desde (1,1)...(10,10)
        MyPoint[] myPuntos = new MyPoint[10];
        for (int i = 0; i< 10; i++){
            myPuntos[i] = new MyPoint(i+1,i+1);
        }
        //Mostrar las distancias de todos los puntos:
        double [][] matrizDistancia = new double [10][10];
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i =0; i < 10; i++){
            for (int j = 0; j<10; j++){

                matrizDistancia[i][j] = myPuntos[i].distance(myPuntos[j]);
                System.out.print(+matrizDistancia[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
