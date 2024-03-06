package es.uah.matcomp.mp.e1.Polimorfismos;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square ( double side, String color, boolean filled){
        super(color, filled, side, side);
    }
    public double getSide(){
        return getWidth(); //Puede utilizarse igualmente setLength() ya que  son iguales.
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
