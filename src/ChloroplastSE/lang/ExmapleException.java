package ChloroplastSE.lang;

/**
 * �����������������֣����޸�seeע��ΪChloroplast.lang.����<br>
 * ������if�������ʽ<br>
 * �����ʽ��throw new InvalidCodesException("��Ϣ");
 * @since �㵱ǰ�İ汾����1.3-Snapshot
 * @see ChloroplastSE.lang.ExmapleException
 */
public class ExmapleException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
     *������ע�⣬���д��Ҫ���о��ں����< br >
	 */
     public ExmapleException(String message) throws ExmapleException{
		super(message);
		}
     static String check(String c) throws InvalidCodesException {
         if(c.isEmpty()) {  //�滻�����Լ�������
             throw new InvalidCodesException("Statement cannot be empty.");
         }
         if((c.length() == 1)){//�滻�����Լ�������
          throw new InvalidCodesException("Please, input some valid code!");
         }

         return String.valueOf(c);
     }
}
