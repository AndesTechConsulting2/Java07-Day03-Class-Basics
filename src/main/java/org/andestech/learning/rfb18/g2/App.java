package org.andestech.learning.rfb18.g2;

import java.util.Random;

public class App
{
    public static void main( String[] args ) throws InterruptedException {

        Customer customer1 = new Customer();
        customer1.name="Basil";
        customer1.sname ="The Wolf";
        customer1.age=19;
        customer1.ballance=1000;
       // customer1.setId(123897);

        System.out.println( customer1.getCustomerInfo() );

        Customer2 customer2 =
      new Customer2("Peter","First", 22, 200);

        Customer2 customer3 = new Customer2("Basil","Basil", 21);
        System.out.println(customer3.getCustomerInfo());

        System.out.println("Number: " + Customer2.getCount());

        Utils.echo("-");

        new Customer2("Peter","First", 22, 200);
        new Customer2("Peter2","First", 22, 200);
        new Customer2("Peter3","First", 22, 200);

        System.out.println("Number: " + Customer2.getCount());

        Utils.echo("*",90);

        int min=-1000, max=1000;
        for(int i=0; i<15; i++)
        {
            Thread.sleep(2);
            System.out.println(Utils.getRandom2(min,max) + " --- " +
            new Random().nextDouble());



        }
    }
}
