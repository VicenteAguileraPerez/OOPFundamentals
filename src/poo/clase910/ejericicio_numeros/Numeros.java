/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase910.ejericicio_numeros;

/**
 *
 * @author vicen
 */
public class Numeros 
{
    private double a,b,c;
    private String nombre;

    public Numeros()
    {
      this.a=this.b=this.c=1;
      this.nombre="";
    }

    public Numeros(double a, double b) 
    {
        this.a = a;
        this.b = b;
        this.nombre="";
        this.c=1;
    }

    public Numeros(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nombre="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setAB(double a, double b)
    {
        this.a=a;
        this.b=b;
    }
    public void setABC(double a, double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
       
    }
    public double getPotencia()
    {
        //a eleva x a*a*a*a*a*a*a*...*X     X!=0 a^0=1         a^-x=1/a^x
        double res = 1;
        if(b<0)
        {
            for(int i=1;i<=-1*b;i++)
            {
                res=res*a;
                //res*=a;
            }
            res=1/res;
        }
        else
        {
            for(int i=1;i<=b;i++)
            {
                res=res*a;
                //res*=a;
            }
        }
        return res;
    }
    public void getTabla()
    {
        /*
            tabla a desde b hasta c
            a=5 b=4 c=6
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
        */
        System.out.println("__________________________________________________________");
        System.out.println("                          tabla                           ");   
        System.out.println("__________________________________________________________");
        for(int i=(int) b;   i<=c;    i++)
        {  
            System.out.println(a+"x"+i+"="+(a*i));
        }
         System.out.println("__________________________________________________________");
        
    }
    public void getNumeroMayor()
    {
        //a ,b, c
        /*
            a>b && a>c    a
            b>a && b>c    b
            c>a  && c>b   c
         */
         System.out.println("__________________________________________________________");
         System.out.println("                          mayor                           ");   
         System.out.println("__________________________________________________________");
        if(a>b && a>c)
        {
            System.out.println("El numero mayor es: "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("El numero mayor es: "+b);
        }
        else
        {
            System.out.println("El numero mayor es: "+c);
        }
         System.out.println("__________________________________________________________");
        
        
    }
    public double getRaizCuadrada()
    {
        //Math.sqrt(X);
        /**
         *  Condicion
         *  sqrt(x) e R -> x e R  Y  x>=0 
         *  suposicion
         *  sqrt0(x)=X     X=X*X dado que se cumple para 1 y para 0
         * 
         * 
         *  sqrtN=(Ranterio*Ranterio)+X/(2*Ranterio)
         * 
         *  sqrt(10) = 3.1622776601683793319988935444327
         *  x=10
         *  r0 = 10
         *  r1 = (10*10)+10/2*10=110/20=5.5
         *  r2 = (5.5*5.5)+10/(2*5.5)=40.25/11=3.6590909090909090909090909090909
         *  r3 = (3.6590909090909090909090909090909*3.6590909090909090909090909090909)+10/(2*3.6590909090909090909090909090909)=3.1960050818746470920383963862225
         *  r4 = (3.1960050818746470920383963862225*3.1960050818746470920383963862225)+10/(2*3.1960050818746470920383963862225)= 3.1624556228038900971112677145441
         *  r5 = (3.1624556228038900971112677145441*3.1624556228038900971112677145441)10/(2*3.1624556228038900971112677145441)=3.1624556228038900971112677145441
         *  Ri*Ri-X>0.000000001
         */
        double r=a;
        do
        {
            r=((r*r)+a)/(2*r);
        }while(r*r-a>0.0000000000001);
        return r;
    }
    
    
}
