package com.ml.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

/**
 * Hello world!
 *
 */
public class Server 
{
    public static void main( String[] args )
    {
        System.out.println( "Ignition.........." );
        Ignite ignite = Ignition.start("D:\\IgniteSpace\\myignite\\src\\main\\resources\\example-ignite.xml");
        
    }
}
