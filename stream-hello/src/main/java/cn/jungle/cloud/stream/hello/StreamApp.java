package cn.jungle.cloud.stream.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class StreamApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(StreamApp.class, args);
        System.out.println( "Hello StreamApp!" );
    }
}
