package info.dearth.dearth_module;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
//        
//        InputStream is = App.class.getResourceAsStream(args[0]);
//        
//        if (is != null) {
//        	Properties properties = new Properties();
//        	
//        	try {
//				properties.load(is);
//				properties.list(System.out);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        }
    }
}
