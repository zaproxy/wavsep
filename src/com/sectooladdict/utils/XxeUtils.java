package com.sectooladdict.utils;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XxeUtils {

    /** Method used by the XXE test cases. */
    public static String process(InputStream stream) throws Exception {
        String empDetails = "";

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(stream);
        NodeList list = document.getElementsByTagName("employee");

        for (int index = 0; index < list.getLength(); index++) {
            Node node = list.item(index);
            Element element = (Element) node;
            empDetails = empDetails + element.getTextContent() + "<br>";
        }
        return empDetails;
    }
}
