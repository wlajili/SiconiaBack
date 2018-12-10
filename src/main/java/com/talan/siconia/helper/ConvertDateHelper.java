package com.talan.siconia.helper;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ConvertDateHelper {
	
	public static XMLGregorianCalendar getXMLGregorianCalendarFromDate (Date date){
	    XMLGregorianCalendar xmlDate = null;
	    GregorianCalendar gc = new GregorianCalendar();
	    gc.setTime(date); 
	 
	    try{
	      xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
	    }catch(Exception e){
	      e.printStackTrace();
	    } 
	    return xmlDate;
	  }
	
	public static Date getDateFromXMLGregorianCalendar (XMLGregorianCalendar xmlDate) {
		return xmlDate.toGregorianCalendar().getTime();
	}

}
