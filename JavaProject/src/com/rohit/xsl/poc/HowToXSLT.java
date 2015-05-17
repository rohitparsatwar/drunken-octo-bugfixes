package com.rohit.xsl.poc;

import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class HowToXSLT {

	public static void main(String[] args) {
		  try {

		    TransformerFactory tFactory = TransformerFactory.newInstance();

		    Transformer transformer =
		      tFactory.newTransformer
		         (new javax.xml.transform.stream.StreamSource
		            ("D:\\Eclipse Workspaces\\switchPrep\\JavaProject\\src\\com\\rohit\\xsl\\poc\\howto.xsl"));

		    transformer.transform
		      (new javax.xml.transform.stream.StreamSource
		            ("D:\\Eclipse Workspaces\\switchPrep\\JavaProject\\src\\com\\rohit\\xsl\\poc\\howto.xml"),
		       new javax.xml.transform.stream.StreamResult
		            ( new FileOutputStream("howto.html")));
		    }
		  catch (Exception e) {
		    e.printStackTrace( );
		    }
	}
	
}
