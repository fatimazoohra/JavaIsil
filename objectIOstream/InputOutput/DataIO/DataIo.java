package DataIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataIo {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		File fo = new File("fichierBis.txt");
		
		try {
			bos = new BufferedOutputStream( new FileOutputStream(fo));
			dos = new DataOutputStream(bos);
			dos.writeByte(1);
			dos.writeInt(56);
			dos.writeFloat(64);
			dos.writeDouble(94.21d);
			bos.close();
			
			bis = new BufferedInputStream(new FileInputStream(fo));
			dis = new DataInputStream(bis);
			//byte b = dis.readByte();
			//char b = dis.readChar();
			//int b= dis.readInt();
			System.out.println(dis.readInt());
			System.out.println(dis.readByte());

			
			
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
