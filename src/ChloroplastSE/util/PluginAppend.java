package ChloroplastSE.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
/**
 * 追加一个文档到该文档的末尾。
 * @see Chloroplast.util.PluginAppend
 */
public class PluginAppend {
    public PluginAppend(String floder) throws Exception{
    	Scanner Scanner = new Scanner(System.in);      
    	String FLODER = Scanner.nextLine();
    	FileOutputStream fop = new FileOutputStream(floder);
    	ArrayList<String> TEXTS = new ArrayList<String>();
    	  BufferedReader bin = new BufferedReader(new FileReader(floder));
          String read;
          String READED = Scanner.nextLine(); 	
          File file = new File(FLODER);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        for(int j = 1; j < TEXTS.size(); j++){
        writer.write(TEXTS.get(j));
        writer.flush();
        writer.close();
        }
    }
    public static void Append() throws Exception{
    	Scanner Scanner = new Scanner(System.in);
    	String FLODER = Scanner.nextLine();
         try {
			FileOutputStream fop = new FileOutputStream(FLODER);
			ArrayList<String> TEXTS = new ArrayList<String>();
			  BufferedReader bin = new BufferedReader(new FileReader(FLODER));
		  String read;
		while((read = bin.readLine())!=null){
			  TEXTS.add(bin.readLine());
		  }
		} catch (Exception e) {
			System.out.printf("Error" + "\n" + e.getMessage() + "This is java throwned exception.");
		}
    }
}
