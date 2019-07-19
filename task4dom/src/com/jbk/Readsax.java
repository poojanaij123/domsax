package com.jbk;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Readsax {
	public static void main(String[] args) {
		try{
			File fxmlfile=new File("C:/Users/pooja/eclipse-workspace/task4dom/sax.xml");
			DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
			Document doc=dbBuilder.parse(fxmlfile);
			
			System.err.println("Root Element:"+doc.getDocumentElement().getNodeName());
			
			NodeList nList=doc.getElementsByTagName("staff");
			
			System.err.println("---------"+nList);
			
			for(int temp=0;temp<nList.getLength();temp++){
			
			Node nNode=nList.item(temp);
			
			System.out.println("\nCurrent Element:"+nNode.getNodeName());
			
			if(nNode.getNodeType()==Node.ELEMENT_NODE){
				
				Element eElement=(Element) nNode;
				System.out.println("staff id:"+eElement.getAttribute("id"));
				System.out.println("firstname:"+eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("lastname:"+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("nickname:"+eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("salary:"+eElement.getElementsByTagName("salary").item(0).getTextContent());
			}
			
			}
			}catch (Exception e) {
				e.printStackTrace();
			}}}
			
		
		

	
