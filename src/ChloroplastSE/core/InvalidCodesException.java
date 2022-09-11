package ChloroplastSE.core;

@SuppressWarnings("serial")
/***
 * 
 * @author Flare
 * @InvalidCodesException是指用户未输入任何有效的函数时引发的异常。
 */
public class InvalidCodesException extends Exception {
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
