package de.bsm.personenservice;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String id = UUID.randomUUID().toString();
    	System.out.println(id);
    	
        System.out.println( "Hello World!" );
    }
}
