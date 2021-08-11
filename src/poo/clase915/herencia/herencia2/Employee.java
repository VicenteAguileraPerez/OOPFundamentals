/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase915.herencia.herencia2;

/**
 *
 * @author vicen
 */
public class Employee  extends Person
{
    private float salary;

    public Employee(int id,String name,float salary)
    {
      super(id, name);//Person p = new Person(id,name)
      this.salary = salary;
      System.out.println("Employee created");
    }
    
    public void display()
    {
        System.out.println(super.getId()+" "+super.getName()+" "+ salary);
    }
    
    
    
}
