package FileChannel;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChnl {

	public static void main(String[] args) {
		FileInputStream fis ;
		BufferedInputStream bis;
		FileChannel fc ;
		try {
			fis = new FileInputStream(new File("fichierBis.txt"));
			bis = new BufferedInputStream(fis);
			long time = System.currentTimeMillis();
			while(bis.read() != -1);
			System.out.println("temps d'excecution avec FileChannel: "+(System.currentTimeMillis()-time));
			fis = new FileInputStream(new File("fichierBis.txt"));
			fc = fis.getChannel();
			int size  = (int)fc.size();
			ByteBuffer bBuf = ByteBuffer.allocate(size=6);
			time = System.currentTimeMillis();
			fc.position(0);
			fc.read(bBuf);
			bBuf.flip();
			System.out.println("temps d'excecution avec FileChannel: "+(System.currentTimeMillis()-time));
			byte[] tabByte = bBuf.array();
			
			/////////
			fc.read(bBuf);
			bBuf.limit(2);
			System.out.println(bBuf.position());
			System.out.println(bBuf.limit()+"\n");
			/////////
			fc.read(bBuf);
				bBuf.limit(4);
				System.out.println(bBuf.position());
				System.out.println(bBuf.limit()+"\n");
			/////////////////////////
			for (byte b : tabByte ) {
				System.out.println((int)b+"\n");
			}
			
		} catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		
	

	}

}
