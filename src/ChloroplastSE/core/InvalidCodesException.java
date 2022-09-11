package ChloroplastSE.core;

@SuppressWarnings("serial")
/***
 * 
 * @author Flare
 * @InvalidCodesException��ָ�û�δ�����κ���Ч�ĺ���ʱ�������쳣��
 */
public class InvalidCodesException extends Exception {
     public InvalidCodesException(String message) throws InvalidCodesException{
		super(message);
		}
     static String check(String c) throws InvalidCodesException {
         if(c.isEmpty()) {  //�ж��Ƿ�Ϊ��
             throw new InvalidCodesException("Statement cannot be empty.");
         }
         if((String.valueOf(c.matches(c))) != "^.*(getVersion()|getter.newGetter(String).*$"){
          throw new InvalidCodesException("Please, input some valid code!");
         }

         return String.valueOf(c);
     }
}
