package com.fkcw.xml;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
			DocumentBuilder bulier = fac.newDocumentBuilder();
			Document doc = bulier.parse(new File("book.xml"));
			org.w3c.dom.Element root =doc.getDocumentElement();
			System.out.println(root.getAttribute("catalog"));
			NodeList list = root.getElementsByTagName("book");
			for (int i = 0; i < list.getLength(); i++) {
				org.w3c.dom.Element book = (org.w3c.dom.Element) list.item(i);
				System.out.println("--------------------------------");
				System.out.println("id="+book.getAttribute("id"));
				NodeList crdlist = book.getChildNodes();
				for (int j = 0; j < crdlist.getLength(); j++) {
					Node crd =  crdlist.item(j);
					if(crd instanceof org.w3c.dom.Element){
						System.out.println("|---"+crd.getNodeName()+"=="+crd.getTextContent());						
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
