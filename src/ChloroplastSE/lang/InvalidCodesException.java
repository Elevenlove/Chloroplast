package ChloroplastSE.lang;
/**
 * chloroplast�У��ܱ�resolve��ͨ������䣬��Ϊ��Ч��䣨Valid code������resolve����ͨ������䣬�������InvalidCodesException����Ч�����쳣����
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
	 * ��chloroplast�У��ܱ�resolve��ͨ������䣬��Ϊ��Ч��䣨Valid code������resolve����ͨ������䣬�������InvalidCodesException����Ч�����쳣����
	 * ������ֵİ汾��1.2-SnapShot
	 * @param message
	 * @throws InvalidCodesException
	 */
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
