package com.econcalendar.econcalendar;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
//create core component of parsing and Setting InputStream from assets

public class XmlParsingActivity extends Activity {
    /** Called when the activity is first created. */
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        bindDataToListing();
    }

    private void bindDataToListing() {
        try {
            SAXParserFactory saxparser = SAXParserFactory.newInstance();
            SAXParser parser = saxparser.newSAXParser();
            XMLReader xmlReader = parser.getXMLReader();
            ParsingClass pc = new ParsingClass();
            xmlReader.setContentHandler(pc);
            InputStream is = getAssets().open("xmldocument1.xml");
            xmlReader.parse(new InputSource(is));
            BindingData bindingData = new BindingData(this, pc.title,
                    pc.country, pc.date);
            listView.setAdapter(bindingData);
        } catch (Exception e) {
            e.getMessage();

        }
    }
}