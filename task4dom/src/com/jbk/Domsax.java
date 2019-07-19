package com.jbk;



import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Domsax {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
		DocumentBuilder b=f.newDocumentBuilder();
		Document doc=b.newDocument();
		
	    Element rootele=doc.createElement("student");
	    Element studentele=doc.createElement("student");
	    Element nameele=doc.createElement("name");
	    Element emaiele=doc.createElement("email");
	    Element mobileele=doc.createElement("mobile");
	    Element addresele=doc.createElement("address");
	    
	    
	    Text t1=doc.createTextNode("pooja");
	    Text t2=doc.createTextNode("92poojanaikmail.com");
	    Text t3=doc.createTextNode("12345678");
	    Text t4=doc.createTextNode("USA-Network");
	    
	    nameele.appendChild(t1);
	    emaiele.appendChild(t2);
	    mobileele.appendChild(t3);
	    addresele.appendChild(t4);
	    
	    studentele.appendChild(nameele);
	    studentele.appendChild(emaiele);
	    studentele.appendChild(mobileele);
	    studentele.appendChild(addresele);
	    
	    rootele.appendChild(studentele);
	    doc.appendChild(rootele);
	    Transformer t=TransformerFactory.newInstance().newTransformer();
	    t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("F:\\File.xml")));
	    System.out.println("XML file generated..");
	    
		
	}

}
