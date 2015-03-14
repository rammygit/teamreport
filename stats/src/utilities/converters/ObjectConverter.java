package utilities.converters;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class ObjectConverter {
	
	/**
	 * private constructor to prevent from initialization.
	 */
	private ObjectConverter(){
		
	}
	
	/**
	 * if value is null returns null, 
	 * converts only if value is real. 
	 * @param value
	 * @return
	 */
	public static String toString(Integer value){
		if(value!=null)
			return String.valueOf(value);
		return null;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String toString(Object value){
		if(value!=null)
			return String.valueOf(value);
		return null;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Integer toInteger(String value) {
		if(value!=null)
			return Integer.valueOf(value);
		
		return null;
	}

}
