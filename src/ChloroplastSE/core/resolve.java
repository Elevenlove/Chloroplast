package ChloroplastSE.core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import ChloroplastSE.network.*;
import ChloroplastSE.core.*;
import ChloroplastSE.lang.InvalidCodesException;
/**
 * �����࣬ʶ�����д��롣<br>�����������Ķ����Լ����Զ�����䡣
 * @since 1.0-Alpha
 * @see Chloroplast.core.resolve
 */
@SuppressWarnings("unused")
public class resolve {
	static int i = 1;
	static ArrayList<String> Scanned = new ArrayList<String>();
	//Init Object!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	/**
	 * resolver��resolve�е�һ����������Ҫʶ��ͨ����Щ��Ч�Ĵ��롣
	 * @throws InvalidCodesException ����δ��ͨ���Ĵ���ʱ�׳�
	 */
  public static void resolver() throws InvalidCodesException{
	for (i = 1; i < Scanned.size(); i++)
		if (Scanned.get(i) == "getVersion"){
		  ConfInfo Version = new ConfInfo();
		System.out.printf("The chloroplast Standard Edition Runtime in 1.0 release-a1"); 	
	if(Scanned.get(i) == "GetHashcode()"){
      if(Scanned.get(i).substring(1) != null){//�ж��Ƿ�Ϊ�յĲ���
    	  System.out.println((Scanned.get(i).hashCode()));
      }else{
    	  throw new NullPointerException("��������Ϊ��! at" + Scanned.lastIndexOf(i));
      }
    if(Scanned.get(i) == "var()"){
        if(Scanned.get(i).substring(1) != null){//Note: var only plays the role of creating variables and cannot be assigned values.
        	 HashMap<String, Integer> Vargables = new HashMap<String, Integer>();
			 Vargables.put(Scanned.get(i).substring(1), 0);
        }else{
      	  throw new NullPointerException("��������Ϊ��! at" + Scanned.lastIndexOf(i));
        }
    }
  }

}
  }
  /**
   * �÷���Ϊ���߷����������Ƕ�ȡ�ĵ��е���䵽Scanned�����С�
   * @param path Ŀ���ĵ��ľ���·��
   * @return Scanned һ������
   * @throws IOException ��������I/O�쳣
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
	  System.out.println("chloroplast �������а汾 1.0 release-a1" +  "\n" + "���������ļ�·����" + "\n");
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
