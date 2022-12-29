
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatPdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean z = true;
		
		while (z) {

		System.out.println("Pleas enter your the number 1 for creat 100 Pdf File");
		System.out.println("Pleas enter your the number 2 for the search in Pdf File");
		System.out.println("\n");
		System.out.println("Pleas enter your the number :");
		int input=sc.nextInt();
		if(input==1) {
		
		
		int count=0;
		try {
			for(int i =0; i<100; i++) {

			Document document = new Document();
			PdfWriter.getInstance(document,
					new FileOutputStream(count +"C:\\Users\\Lenovo\\eclipse-workspace\\Evaluation\\Pdf13\\yahya.pdf"));
			document.open();
			document.add(new Paragraph("old"));
			document.close();
				count=count+1;
			}
			
		}catch (DocumentException e) {
			System.out.println(e);
		}
		System.out.println("executed");
		
		}else if(input==2) {
//			File f1 = new File("yahya.pdf"); // Creation of
			
			  PdfReader fr = new PdfReader("C:\\Users\\Lenovo\\eclipse-workspace\\Evaluation\\Pdf13\\yahya.pdf");
				

			
			
			

			String[] words = null; // Intialize the word Array
//
//			FileReader fr = new FileReader(f1); // Creation of File Reader object
			BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
			String s;
			System.out.println("Pleeas Enter the word you want to search: ");
//
			String input1 = sc.next(); // Input word to be searched
			int count1 = 0; // Intialize the word to zero
//
			while ((s = br.readLine()) != null) // Reading Content from the file
			{
				words = s.split(""); // Split the word using space
				for (String word : words) {
					if (word.equals(input1)) // Search for the given word
					{
						count1++; // If Present increase the count by one
					}
				}
			}
			if (count1 != 0) // Check for count not equal to zero
			{
				System.out.println("The given word is present for " + count + " Times in the file");
			} else {
				System.out.println("The given word is not present in the file");
			}

			fr.close();
		}else {
			z = false;
			System.out.println("Good Bye");
		}
		}
	}
}