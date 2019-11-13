package inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOut {

	public static void main(String[] args) {
		FileInputStream fis = null;
		File f = new File("file.txt");
		try {
			fis=new FileInputStream(f);
			byte[] buf = new byte[20];
			int n;
			while((n=fis.read(buf))>=0) {
				for(int i=0;i<n;i++)
					System.out.print((char)buf[i]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();	
			}
		}
    }
	}       
       