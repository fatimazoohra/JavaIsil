package inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInOut {

	public static void main(String[] args) {
	
			FileInputStream fis = null;
			FileOutputStream fos = null;
			BufferedInputStream bis
			
			
			File f = new File("file.txt");
			File fo = new File("fichierCp.txt");
			try {
				fis=new BufferedInputStream(f);
				fos=new BufferedOutputStream(fo);
				byte[] buf = new byte[20];
				int n;
				
				while((n=fis.read(buf))>=0) {
					for(int i=0;i<n;i++)
						//System.out.print((char)buf[i]);
						fos.write(buf[i]);		
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
			long t =System.currentTimeMillis();
			System.out.println(t);

	}

}
