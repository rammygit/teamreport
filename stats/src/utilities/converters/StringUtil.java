package utilities.converters;

/**
 * 
 * @author ramkumarsundarajan
 *
 */
public class StringUtil {
	
	/**
	 * private constructor to prevent from initialization.
	 */
	private StringUtil(){
		
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
	
	public static String toString(Object value){
		if(value!=null)
			return String.valueOf(value);
		return null;
	}

}
