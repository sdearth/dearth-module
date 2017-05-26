package info.dearth.dearth_module;

import java.io.IOException;

/**
 * This app just uses the Resources class to load all of the properties 
 * files contained in a specified directory into a single Properties 
 * Object.
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        Resources myresources = new Resources();
        
        //Pass in the name of the directory that contains the 
        //properties I want to load. This directory will be in
        //the jar file, so will be on the claspath when the jar
        //is added to the classpath
        myresources.loadResources("properties");
    }
}
