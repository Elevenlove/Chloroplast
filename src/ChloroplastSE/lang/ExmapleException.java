package ChloroplastSE.lang;

/**
 * 如果你更改了它的名字，请修改see注解为Chloroplast.lang.名字<br>
 * 条件改if布尔表达式<br>
 * 输出格式：throw new InvalidCodesException("消息");
 * @since 你当前的版本，如1.3-Snapshot
 * @see ChloroplastSE.lang.ExmapleException
 */
public class ExmapleException extends Exception{
	private static final long serialVersionUID = 1L;
	/**
     *构造器注解，随便写，要换行就在后面加< br >
	 */
     public ExmapleException(String message) throws ExmapleException{
		super(message);
		}
     static String check(String c) throws InvalidCodesException {
         if(c.isEmpty()) {  //替换成你自己的条件
             throw new InvalidCodesException("Statement cannot be empty.");
         }
         if((c.length() == 1)){//替换成你自己的条件
          throw new InvalidCodesException("Please, input some valid code!");
         }

         return String.valueOf(c);
     }
}
