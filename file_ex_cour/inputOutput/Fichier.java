package inputOutput;

import java.io.File;

public class Fichier {

	public static void main(String[] args) {
		//Créer un fichier objet
        File d= new File("C:\\"); 
        int n=0;
        /*if (d.exists())
        	for( File f : d.listFiles()) {
        		
        		System.out.printf("%d %-15s \t",n+1,f.getName());
        		n++;
        		if((n%4)==0)  System.out.println();
        		
        	}
        else System.out.println("Ce dossier n'existe pas !!");*/
        	
        
        if (d.exists()) {
        	for( File f : d.listFiles()) {
        		
        		if((n%4)==0)  System.out.println();
        		else {
        			if(f.isDirectory()) {
            			System.out.printf("%d %-15s \t",n,f.getName()+"\\");
            		}
        			else {
        			System.out.printf("%d %-15s \t",n,f.getName());
        			}
        		}
        		
        		n++;
        	}
        }else {System.out.println("Ce dossier n'existe pas !!");}
  
        
	}

}
