package com.discount.main;

import com.discount.customer.DiscountContext;
import com.discount.customer.PremiumCustomer;
import com.discount.customer.RegularCustomer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DiscountContext con=new DiscountContext(new RegularCustomer());
        System.out.println(con.calculateTotal(5000));
        System.out.println(con.calculateTotal(10000));
        System.out.println(con.calculateTotal(15000));
        
        con=new DiscountContext(new PremiumCustomer());
        System.out.println(con.calculateTotal(4000));
        System.out.println(con.calculateTotal(8000));
        System.out.println(con.calculateTotal(12000));
        System.out.println(con.calculateTotal(20000));
    }
}
