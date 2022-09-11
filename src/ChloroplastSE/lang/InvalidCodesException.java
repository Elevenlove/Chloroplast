package ChloroplastSE.lang;
/**
 * chloroplast中，能被resolve所通过的语句，称为有效语句（Valid code），当resolve不能通过该语句，便会引发InvalidCodesException（无效代码异常）。
 * @author Flare
 * @see Chloroplast.lang.core.InvalidCodesException
 * @since 1.2-SnapShot
 */
public class InvalidCodesException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 在chloroplast中，能被resolve所通过的语句，称为有效语句（Valid code），当resolve不能通过该语句，便会引发InvalidCodesException（无效代码异常）。
	 * 最早出现的版本：1.2-SnapShot
	 * @param message
	 * @throws InvalidCodesException
	 */
     public InvalidCodesException(String message) throws InvalidCodesException{
		super(message);
		}
     static String check(String c) throws InvalidCodesException {
         if(c.isEmpty()) {  //判断是否为空
             throw new InvalidCodesException("Statement cannot be empty.");
         }
         if((String.valueOf(c.matches(c))) != "^.*(getVersion()|getter.newGetter(String).*$"){
          throw new InvalidCodesException("Please, input some valid code!");
         }

         return String.valueOf(c);
     }
}
