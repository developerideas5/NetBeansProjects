/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.swe;

import java.util.Enumeration;
import java.util.Hashtable;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class SaxDictionaryLoader implements ContentHandler {

    private Hashtable<String, String> dictionary;

    public SaxDictionaryLoader(Hashtable<String, String> dict) {
    	this.dictionary = dict;
    }
    
    public void startDocument() throws SAXException {
        //dictionary = new Hashtable();
    }

    private String wordEnglish;
    private String wordGerman;
    private boolean bEnglishWord = false;
    private boolean bGermanWord = false;
    
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
	    String key = localName;
	    if ( key.equals("entry") ) {
		    //System.out.print("s...");	
		    wordEnglish = "";
		    wordGerman = "";
		    
	    } else if ( key.equals("orth") ) {
	    	bEnglishWord = true;
		    
	    } else if ( key.equals("quote") ) {
	    	bGermanWord = true;
	    }   
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
        if ( bEnglishWord ) {
	    	wordEnglish = new String(ch, start, length);  
		    //System.out.print(wordEnglish+"...");	      	
        	bEnglishWord = false;
        	
        } else if ( bGermanWord ) {
        	wordGerman += new String(ch, start, length)+";";  
		    //System.out.print(wordGerman+"...");	
        	bGermanWord = false;
        }
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
	    String key = localName;
	    if ( key.equals("entry") ) {
		    //System.out.println("e");	    
	        dictionary.put(wordEnglish, wordGerman);	
	    }
	}

	@Override
	public void endDocument() throws SAXException {
        Enumeration e = dictionary.keys();
        while (e.hasMoreElements()) {
            String key = (String)e.nextElement();
            String value = (String)dictionary.get(key);
            //System.out.println("" + key + ": " + value );
        }  
        System.out.println("Nr of words: " + dictionary.size());
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// TODO Auto-generated method stub
		
	}
    

}