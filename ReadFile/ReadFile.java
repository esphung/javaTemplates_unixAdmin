/*
* @Author: Eric Phung
* @Date:   2015-03-05 16:58:44
* @Last Modified by:   Eric Phung
* @Last Modified time: 2015-03-05 17:01:05
*/
import java.util.*;
import java.io.*;

public class ReadFile {
  public static void main(String[] args){
	  new ReadFile();
  } // end main

  public ReadFile(){
	  try {
		  File theFile = new File("poem.txt");
		  Scanner input = new Scanner(theFile);
		  while (input.hasNext()){
			  System.out.println(input.nextLine() + ", dude!");
		  } // end while
	  } catch (IOException e){
		  System.out.println(e.getMessage());
	  } // end try
  } // end constructor
} // end readFile
