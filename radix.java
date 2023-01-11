// import used packages
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class radix {
    public static void
    sortLexicographicOrder(String strArr[]){//array of string passed from text file

    	LinkedList[] array1 = new LinkedList[31]; //" ",".","-",",","\'", a,b,c ... z 
												  //" " = list[0], "a" = list[5], and so on
		LinkedList[] array2 = new LinkedList[31];

		int count = 0; //count how many times the loop run
		int n = 0;//n or input
		int k = 0;//constant
		int b = array1.length; //base
		int d = 0;//times

		int max=0;
		k++;
		for(int i=0;i<strArr.length;i++){//determine max length of string in array
			if(strArr[i].length()>max){
				max = strArr[i].length();
				
			}
		}
		n+=3;

		for(int i=0;i<strArr.length;i++){//fill the rest of letters with empty space behind
			while(strArr[i].length()<max){
				strArr[i]=strArr[i]+" ";
				
			}
		}
		n+=4;
		k++;
		
		max--;//to make sure index is 0 to maximum length - 1
		for(int i=0;i<array1.length;i++){//initialize array1 and 2
			array1[i] = new LinkedList();
			array2[i] = new LinkedList();
		}
		n+=4;

		for(int i=0;i<strArr.length;i++){//sort into linkedlist 1
			switch(strArr[i].charAt(max)){
				case ' ':
					array1[0].add(strArr[i]);
					break;
				case '\'':
					array1[1].add(strArr[i]);
					break;
				case ',':
					array1[2].add(strArr[i]);
					break;
				case '-':
					array1[3].add(strArr[i]);
					break;
				case '.':
					array1[4].add(strArr[i]);
					break;
				case 'a':
					array1[5].add(strArr[i]);
					break;
				case 'b':
					array1[6].add(strArr[i]);
					break;
				case 'c':
					array1[7].add(strArr[i]);
					break;
				case 'd':
					array1[8].add(strArr[i]);
					break;
				case 'e':
					array1[9].add(strArr[i]);
					break;
				case 'f':
					array1[10].add(strArr[i]);
					break;
				case 'g':
					array1[11].add(strArr[i]);
					break;
				case 'h':
					array1[12].add(strArr[i]);
					break;
				case 'i':
					array1[13].add(strArr[i]);
					break;
				case 'j':
					array1[14].add(strArr[i]);
					break;
				case 'k':
					array1[15].add(strArr[i]);
					break;
				case 'l':
					array1[16].add(strArr[i]);
					break;
				case 'm':
					array1[17].add(strArr[i]);
					break;
				case 'n':
					array1[18].add(strArr[i]);
					break;
				case 'o':
					array1[19].add(strArr[i]);
					break;
				case 'p':
					array1[20].add(strArr[i]);
					break;
				case 'q':
					array1[21].add(strArr[i]);
					break;
				case 'r':
					array1[22].add(strArr[i]);
					break;
				case 's':
					array1[23].add(strArr[i]);
					break;
				case 't':
					array1[24].add(strArr[i]);
					break;
				case 'u':
					array1[25].add(strArr[i]);
					break;
				case 'v':
					array1[26].add(strArr[i]);
					break;
				case 'w':
					array1[27].add(strArr[i]);
					break;
				case 'x':
					array1[28].add(strArr[i]);
					break;
				case 'y':
					array1[29].add(strArr[i]);
					break;
				case 'z':
					array1[30].add(strArr[i]);
					break;
			}
			
		}
		n+=4;
		count++;
		k++;

		if(max==0){//to make sure index does not go out of bound
			max=0;
			k++;
		}
		else
		max--;

		k++;
		
		n++;
		while(count<strArr.length){//continue looping until first array length is done
		
			for(int i=0;i<array1.length;i++){//sorting from array1 to array2
			
				int repeat = array1[i].size();//repeat the many times for the size of current array

				for(int j=0;j<repeat;j++){
					
					char tempchar =	((String) array1[i].getFirst()).charAt(max);

					switch(tempchar){
						case ' ':
							array2[0].add(array1[i].getFirst());//add first element in array
							break;
						case '\'':
							array2[1].add(array1[i].getFirst());
							break;
						case ',':
							array2[2].add(array1[i].getFirst());
							break;
						case '-':
							array2[3].add(array1[i].getFirst());
							break;
						case '.':
							array2[4].add(array1[i].getFirst());
							break;
						case 'a':
							array2[5].add(array1[i].getFirst());
							break;
						case 'b':
							array2[6].add(array1[i].getFirst());
							break;
						case 'c':
							array2[7].add(array1[i].getFirst());
							break;
						case 'd':
							array2[8].add(array1[i].getFirst());
							break;
						case 'e':
							array2[9].add(array1[i].getFirst());
							break;
						case 'f':
							array2[10].add(array1[i].getFirst());
							break;
						case 'g':
							array2[11].add(array1[i].getFirst());
							break;
						case 'h':
							array2[12].add(array1[i].getFirst());
							break;
						case 'i':
							array2[13].add(array1[i].getFirst());
							break;
						case 'j':
							array2[14].add(array1[i].getFirst());
							break;
						case 'k':
							array2[15].add(array1[i].getFirst());
							break;
						case 'l':
							array2[16].add(array1[i].getFirst());
							break;
						case 'm':
							array2[17].add(array1[i].getFirst());
							break;
						case 'n':
							array2[18].add(array1[i].getFirst());
							break;
						case 'o':
							array2[19].add(array1[i].getFirst());
							break;
						case 'p':
							array2[20].add(array1[i].getFirst());
							break;
						case 'q':
							array2[21].add(array1[i].getFirst());
							break;
						case 'r':
							array2[22].add(array1[i].getFirst());
							break;
						case 's':
							array2[23].add(array1[i].getFirst());
							break;
						case 't':
							array2[24].add(array1[i].getFirst());
							break;
						case 'u':
							array2[25].add(array1[i].getFirst());
							break;
						case 'v':
							array2[26].add(array1[i].getFirst());
							break;
						case 'w':
							array2[27].add(array1[i].getFirst());
							break;
						case 'x':
							array2[28].add(array1[i].getFirst());
							break;
						case 'y':
							array2[29].add(array1[i].getFirst());
							break;
						case 'z':
							array2[30].add(array1[i].getFirst());
							break;	
						}
					array1[i].removeFirst();
						
				}
			
			}
		d+=8;
		count++;
		k++;

		if(max==0){
			max=0;
			k++;
		}
		else
		max--;

		k++;

		for(int i=0;i<array1.length;i++){//clear array1
			array1[i] = new LinkedList();
		}
		n+=3;

		if((strArr.length-count)==0){//when sort is done, elements in linked list is
									//copied into text file
			k+=2;
			for(int i=0;i<array1.length;i++){//copy array 2 into file
			int repeat = array2[i].size();
		
				for(int j=0;j<repeat;j++){

					String tempword = (String) array2[i].get(j);
					tempword = tempword.replace(" ", "");//remove empty space
					array2[i].set(j, tempword);
				}
			}
			n+=3;
			d+=5;

		try {
			File outfile = new File("sortedlist.txt");
			if (outfile.createNewFile()) {
			  System.out.println("File created: " + outfile.getName());
			} else {
			  System.out.println("File already exists.");
			}
		  } catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
		  k+=2;
			for(int i=0;i<array1.length;i++){
				int repeat = array2[i].size();
				for(int j=0;j<repeat;j++){

					try {
						FileWriter myWriter = new FileWriter("sortedlist.txt", true);
						String word = (String) array2[i].get(j);
						myWriter.write(word+"\n");
						myWriter.close();
						//System.out.println("Successfully wrote to the file.");
					  } catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					  }
				}

			}
			n+=3;
			d+=6;
			System.out.println("sort done in array2");
			System.out.println("number of primitive count: "+ (d+n+b+k));
			System.exit(1);

		}

		for(int i=0;i<array1.length;i++){
			
			int repeat = array2[i].size();
			
			for(int j=0;j<repeat;j++){//sorting from array2 to array1
				char tempchar =	((String) array2[i].getFirst()).charAt(max);

				switch(tempchar){
					case ' ':
						array1[0].add(array2[i].getFirst());
						break;
					case '\'':
						array1[1].add(array2[i].getFirst());
						break;
					case ',':
						array1[2].add(array2[i].getFirst());
						break;
					case '-':
						array1[3].add(array2[i].getFirst());
						break;
					case '.':
						array1[4].add(array2[i].getFirst());
						break;
					case 'a':
						array1[5].add(array2[i].getFirst());
						break;
					case 'b':
						array1[6].add(array2[i].getFirst());
						break;
					case 'c':
						array1[7].add(array2[i].getFirst());
						break;
					case 'd':
						array1[8].add(array2[i].getFirst());
						break;
					case 'e':
						array1[9].add(array2[i].getFirst());
						break;
					case 'f':
						array1[10].add(array2[i].getFirst());
						break;
					case 'g':
						array1[11].add(array2[i].getFirst());
						break;
					case 'h':
						array1[12].add(array2[i].getFirst());
						break;
					case 'i':
						array1[13].add(array2[i].getFirst());
						break;
					case 'j':
						array1[14].add(array2[i].getFirst());
						break;
					case 'k':
						array1[15].add(array2[i].getFirst());
						break;
					case 'l':
						array1[16].add(array2[i].getFirst());
						break;
					case 'm':
						array1[17].add(array2[i].getFirst());
						break;
					case 'n':
						array1[18].add(array2[i].getFirst());
						break;
					case 'o':
						array1[19].add(array2[i].getFirst());
						break;
					case 'p':
						array1[20].add(array2[i].getFirst());
						break;
					case 'q':
						array1[21].add(array2[i].getFirst());
						break;
					case 'r':
						array1[22].add(array2[i].getFirst());
						break;
					case 's':
						array1[23].add(array2[i].getFirst());
						break;
					case 't':
						array1[24].add(array2[i].getFirst());
						break;
					case 'u':
						array1[25].add(array2[i].getFirst());
						break;
					case 'v':
						array1[26].add(array2[i].getFirst());
						break;
					case 'w':
						array1[27].add(array2[i].getFirst());
						break;
					case 'x':
						array1[28].add(array2[i].getFirst());
						break;
					case 'y':
						array1[29].add(array2[i].getFirst());
						break;
					case 'z':
						array1[30].add(array2[i].getFirst());
						break;
					
					}
				array2[i].removeFirst();
			}
		}
		d+=8;
		count++;

		for(int i=0;i<array1.length;i++){//clear array2
			array2[i] = new LinkedList();
		}
		n+=3;

		if((strArr.length-count)==0){//when sort is done, elements in linked list is
									//copied into text file
			k+=2;
			for(int i=0;i<array1.length;i++){//copy array 1 into file
			int repeat = array1[i].size();
		
				for(int j=0;j<repeat;j++){

					String tempword = (String) array1[i].get(j);
					tempword = tempword.replace(" ", "");
					array1[i].set(j, tempword);
				}
			}
			n+=3;
			d+=5;

		try {
			File outfile = new File("sortedlist.txt");
			if (outfile.createNewFile()) {
			  System.out.println("File created: " + outfile.getName());
			} else {
			  System.out.println("File already exists.");
			}
		  } catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
		  k+=2;
			for(int i=0;i<array1.length;i++){
				int repeat = array1[i].size();
				for(int j=0;j<repeat;j++){

					try {
						FileWriter myWriter = new FileWriter("wordList.txt", true);
						String word = (String) array1[i].get(j);
						myWriter.write(word+"\n");
						myWriter.close();
					  } catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					  }
				}

			}
			n+=3;
			d+=6;
			System.out.println("sort done in array1");
			System.out.println("number of primitive count: "+ (d+n+b+k));
			System.exit(1);
		}
		}
	}
					
	// to handle exceptions include throws
	public static void main(String[] args)
		throws IOException{
		// list that holds strings of a file
		List<String> listOfStrings
			= new ArrayList<String>();
	
		// load data from file
		BufferedReader bf = new BufferedReader(new FileReader("src/wordList.txt"));

		// read entire line as string
		String line = bf.readLine();
	
		// checking for end of file
		while (line != null) {
			listOfStrings.add(line);
			line = bf.readLine();
		}
	
		// closing bufferreader object
		bf.close();
	
		// storing the data in arraylist to array
		String[] array
			= listOfStrings.toArray(new String[0]);

		sortLexicographicOrder(array);
	}
}