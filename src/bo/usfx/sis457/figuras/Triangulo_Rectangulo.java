/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author E R W I N G
 */
public class Triangulo_Rectangulo {
    private double Base;
    private double Altura;
    
    public Triangulo_Rectangulo(double base,double altura)
    {
        this.Base=base;
        this.Altura=altura;
    }
    
    public Triangulo_Rectangulo()
    {
        this(0,0);
    }    

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        this.Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        this.Altura = altura;
    }
    
    public double getArea()
    {
        return (this.Base*this.Altura)/2;  //(base*altura)/2
    }
    
    public double getPerimetro()
    {
        double a=Math.sqrt((this.Base*this.Base)+(this.Altura*this.Altura));
        return (a+this.Base+this.Altura);
    }
    
    public double getHipotenusa()
    {
        return Math.sqrt((this.Base*this.Base)+(this.Altura*this.Altura));
    }
}
