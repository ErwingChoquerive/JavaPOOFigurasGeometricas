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
public class Rombo {
    private double Diametro1;   // diametro ancho
    private double Diametro2;   //diametro largo
    
    public Rombo(double diametro1,double diametro2)
    {
        this.Diametro1=diametro1;
        this.Diametro2=diametro2;
    }
    
    public Rombo()
    {
    this(0,0);
    }

    public double getDiametro1() {
        return Diametro1;
    }

    //diametro de ancho
    public void setDiametro1(double diametro1) {
        this.Diametro1 = diametro1;
    }

    //diametro de largo
    public double getDiametro2() {
        return Diametro2;
    }

    public void setDiametro2(double diametro2) {
        this.Diametro2 = diametro2;
    }
    
    public double getArea()
    {
        return (this.Diametro1*this.Diametro2)/2;
    }
    
    public double getPerimetro()
    {
        double d=this.Diametro1/2;
        double D=this.Diametro2/2;
        double lado=Math.sqrt((d*d)+(D*D));
        return 4*lado;
    }
}
