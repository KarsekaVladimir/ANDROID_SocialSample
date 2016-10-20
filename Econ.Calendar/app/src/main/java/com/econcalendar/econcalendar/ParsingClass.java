package com.econcalendar.econcalendar;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//parse data using default handler that is part of Sax Parser. In this class we have three method startElement , endElement , character. These called when tag start , tag end and read its values. We will save these values inside corresponding values
public class ParsingClass extends DefaultHandler {

    ArrayList<String> title = new ArrayList<String>();
    ArrayList<String> country = new ArrayList<String>();
    ArrayList<String> date = new ArrayList<String>();

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (localName.equalsIgnoreCase("title")) {
            tempStore = "";
        } else if (localName.equalsIgnoreCase("country")) {
            tempStore = "";
        } else if (localName.equalsIgnoreCase("date")) {
            tempStore = "";
        }else{
            tempStore = "";
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        if (localName.equalsIgnoreCase("title")) {
            title.add(tempStore);
        } else if (localName.equalsIgnoreCase("country")) {
            country.add(tempStore);
        } else if (localName.equalsIgnoreCase("date")) {
            date.add(tempStore);
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
