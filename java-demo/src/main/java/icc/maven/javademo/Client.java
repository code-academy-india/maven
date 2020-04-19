package icc.maven.javademo;


public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "maven build system - core java project" );
        System.out.println( "demo for adding properties, dependencies and pass command line args");
        System.out.println("*** received args from runtime ******");
        for(String arg: args)
        	System.out.println("Command line argument " + arg);
        System.out.println(" **** ");
    }
}
