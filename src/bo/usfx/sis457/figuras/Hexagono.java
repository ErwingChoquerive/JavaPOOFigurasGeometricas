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
public class Hexagono {
    private double Lado;
    private double Apotema;      //apotema=radio hacia el medio de dos vertices
    
    public Hexagono(double lado,double apotema)
    {
        this.Lado=lado;
        this.Apotema=apotema;
    }
    
    public Hexagono()
    {
        this(0,0);
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        this.Lado = lado;
    }

    public double getApotema() {
        return Apotema;
    }

    public void setApotema(double apotema) {
        this.Apotema = apotema;
    }
    
    public double getPerimetro()
    {
        return this.Lado*6;
    }
    
    public double getArea()
    {
        double perimetro=getPerimetro();
        return (perimetro*this.Apotema)/2;
    }
}
