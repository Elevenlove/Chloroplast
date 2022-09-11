package ChloroplastSE.core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import ChloroplastSE.network.*;
import ChloroplastSE.core.*;
import ChloroplastSE.lang.InvalidCodesException;
/**
 * 最大的类，识别并运行代码。<br>你可以在这里改动出自己的自定义语句。
 * @since 1.0-Alpha
 * @see Chloroplast.core.resolve
 */
@SuppressWarnings("unused")
public class resolve {
	static int i = 1;
	static ArrayList<String> Scanned = new ArrayList<String>();
	//Init Object!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	/**
	 * resolver是resolve中的一个方法，主要识别并通过那些有效的代码。
	 * @throws InvalidCodesException 当有未被通过的代码时抛出
	 */
  public static void resolver() throws InvalidCodesException{
	for (i = 1; i < Scanned.size(); i++)
		if (Scanned.get(i) == "getVersion"){
		  ConfInfo Version = new ConfInfo();
		System.out.printf("The chloroplast Standard Edition Runtime in 1.0 release-a1"); 	
	if(Scanned.get(i) == "GetHashcode()"){
      if(Scanned.get(i).substring(1) != null){//判断是否不为空的参数
    	  System.out.println((Scanned.get(i).hashCode()));
      }else{
    	  throw new NullPointerException("参数不得为空! at" + Scanned.lastIndexOf(i));
      }
    if(Scanned.get(i) == "var()"){
        if(Scanned.get(i).substring(1) != null){//Note: var only plays the role of creating variables and cannot be assigned values.
        	 HashMap<String, Integer> Vargables = new HashMap<String, Integer>();
			 Vargables.put(Scanned.get(i).substring(1), 0);
        }else{
      	  throw new NullPointerException("参数不得为空! at" + Scanned.lastIndexOf(i));
        }
    }
  }

}
  }
  /**
   * 该方法为工具方法，作用是读取文档中的语句到Scanned数组中。
   * @param path 目标文档的绝对路径
   * @return Scanned 一个数组
   * @throws IOException 当出现了I/O异常
   */
  @SuppressWarnings("resource")
public static ArrayList<String> readFile(String path)throws IOException {
      BufferedReader read = new BufferedReader(new FileReader(path));
      String line;
      while ((line = read.readLine()) != null) {
          Scanned.add(line);
      }
      return Scanned;
  }
@SuppressWarnings("resource")
public static void main(String[] args){
	  System.out.println("chloroplast 正在运行版本 1.0 release-a1" +  "\n" + "输入运行文件路径。" + "\n");
	  Scanner in = new Scanner(System.in);
	  String Filespath = in.nextLine();
	try {
		resolve.readFile(Filespath);
		resolve.resolver();
	} catch (Exception Exceptions) {
		System.out.println("\n Error");
		Exceptions.printStackTrace();
	}
  }
}
