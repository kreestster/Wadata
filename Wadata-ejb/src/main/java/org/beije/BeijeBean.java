package org.beije;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BeijeBean
 */
@Stateless
@Local
public class BeijeBean {

	public String from(){
		return "This text from Ejb";
	}

}
