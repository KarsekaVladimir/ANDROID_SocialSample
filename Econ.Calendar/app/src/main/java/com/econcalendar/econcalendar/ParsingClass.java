package com.econcalendar.econcalendar;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//parse data using default handler that is part of Sax Parser. In this class we have three method startElement , endElement , character. These called when tag start , tag end and read its values. We will save these values inside corresponding values
public class ParsingClass extends DefaultHandler {

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> qua = new ArrayList<String>();

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (localName.equalsIgnoreCase("name")) {
            tempStore = "";
        } else if (localName.equalsIgnoreCase("address")) {
            tempStore = "";
        } else if (localName.equalsIgnoreCase("qua")) {
            tempStore = "";
        }else{
            tempStore = "";
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        if (localName.equalsIgnoreCase("name")) {
            name.add(tempStore);
        } else if (localName.equalsIgnoreCase("address")) {
            address.add(tempStore);
        } else if (localName.equalsIgnoreCase("qua")) {
            qua.add(tempStore);
        }
        tempStore = "";
    }

    private String tempStore = "";

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        tempStore += new String(ch, start, length);
    }

}
