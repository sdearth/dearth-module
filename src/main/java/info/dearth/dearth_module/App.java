package info.dearth.dearth_module;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Resources myresources = new Resources();
        myresources.loadResources("properties");
    }
}
