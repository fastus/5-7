package JsonXmlParsing;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxFileParser {
	public static void main(String arg[]) {
		String fileToParse = "C:\\workspace\\Izmailov_7_8\\src\\JsonXmlParsing\\empl.xml";
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			DefaultHandler handler = new DefaultHandler() {
				boolean bfname = false;
				boolean blname = false;
				boolean bid = false;
				boolean blocation = false;
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					System.out.println("Start Element :" + qName);
					if (qName.equalsIgnoreCase("FIRSTNAME")) {
						bfname = true;
					}
					if (qName.equalsIgnoreCase("LASTNAME")) {
						blname = true;
					}
					if (qName.equalsIgnoreCase("ID")) {
						bid = true;
					}
					if (qName.equalsIgnoreCase("LOCATION")) {
						blocation = true;
					}
				}

				public void endElement(String uri, String localName, String qName) throws SAXException {
					System.out.println("End Element :" + qName);
				}

				public void characters(char ch[], int start, int length) throws SAXException {
					if (bfname) {
						System.out.println("First Name : " + new String(ch, start, length));
						bfname = false;
					}
					if (blname) {
						System.out.println("Last Name : " + new String(ch, start, length));
						blname = false;
					}
					if (bid) {
						System.out.println("ID : " + new String(ch, start, length));
						bid = false;
					}
					if (blocation) {
						System.out.println("location : " + new String(ch, start, length));
						blocation = false;
					}
				}
			};

			saxParser.parse(fileToParse, handler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
