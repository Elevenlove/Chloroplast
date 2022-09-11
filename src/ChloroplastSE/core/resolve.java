package ChloroplastSE.core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import ChloroplastSE.core.*;
@SuppressWarnings("unused")
public class resolve {
	static int i = 1;
	static ArrayList<String> Scanned = new ArrayList<String>();
	//Init Object!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  public static void resolver() throws InvalidCodesException{
	for (i = 1; i < Scanned.size(); i++)
		if (Scanned.get(i) == "getVersion"){
		  ConfInfo Version = new ConfInfo();
		System.out.printf("The chloroplast Standard Edition Runtime in 1.0 release-a1"); 
	  }
	if(Scanned.get(i) == "GetHanshcode()"){
      if(Scanned.get(i).substring(1) != null){
    	  System.out.println((Scanned.get(i).hashCode()));
      }else{
    	  throw new NullPointerException("参数不得为空! at" + Scanned.lastIndexOf(i));
      }
	}
  }
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
		System.out.println("Error");
		Exceptions.printStackTrace();
	}
  }
}
