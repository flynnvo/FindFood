package nz.ac.auckland.cs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FoodObfuscator {

    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("Expected 1 argument of input file name, got " + args.length);
            System.exit(1);
        }

        try {
            BufferedReader s = new BufferedReader(new FileReader(args[0]));
            // read file here or do stuff
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }

}
