package com.rohit.javaparser;

import japa.parser.JavaParser;
import japa.parser.ParseException;
import japa.parser.ast.CompilationUnit;

import java.io.FileInputStream;
import java.io.IOException;

public class Javaparsertest {

	public static void main(String[] args) throws ParseException, IOException {
		// creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream("D:\\Eclipse Workspaces\\switchPrep\\JavaProject\\src\\com\\rohit\\io\\CopyBytes.java");

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }

       int index = cu.getComments().toString().indexOf("@throws");
      
       System.out.println("length-----"+index);
       cu.getComments().remove(index);
        // prints the resulting compilation unit to default system output
        System.out.println(cu.toString());

	}

}
