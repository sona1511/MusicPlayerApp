package com.capg.corejava.application1;
        import java.io.IOException;
		import java.util.Scanner;

		public class MusicSeries {

		enum module1 {H,E,M,Q};
		enum submodule1 {B,S,H1,K,M};
		enum submodule2  {L,P,I,A1,M};
		enum submodule3  {A,Z,G,W,M};

		private static Scanner br;
		/**
		* @param args
		* @throws IOException
		*/
		public static void main(String[] args) throws IOException {
		 String module = null;
		br = new Scanner(System.in);
		   
		   System.out.println("\n\t\t \t\t Listen Your Favourite Music ...");
		   
		while(true)
		{

		 
		System.out.println("======================");
		System.out.println("Choose Your Language");
		System.out.println("======================");
		System.out.println("H-Hindi");
		System.out.println("E-English");
		System.out.println("M-Marathi");
		System.out.println("Q-Quit");
		System.out.println("========================");
		   System.out.println("Enter your choice (H,E,M,Q) : ");


		module=br.nextLine();
		System.out.println(" " );  

		switch(module1.valueOf(module))
		{

		case H:

		System.out.println(" Here's Song List ");
		System.out.println("======================");
		System.out.println("B-Bole Chudiyan");
		System.out.println("S-Sanam Re");
		System.out.println("H1-High Rated Gabru");
		System.out.println("K-Kasam Ki Kasam");
		System.out.println("M-Return to main page");
		System.out.println("======================");
		System.out.println("Enter your choice (B,S,H1,K,M) : ");

		module=br.nextLine();
		switch(submodule1.valueOf(module))
		{

		case B:


		System.out.println("Bole Chudiyan ");
		System.out.println("=======================================");
		System.out.println("Album: Kabhi Khushi Kabhie Gham");
		System.out.println("Duration: 7 min ");
		System.out.println("Released: 2017");
		System.out.println("M-Return to main page");
		System.out.println("=======================================");

		module=br.nextLine();

		break;

		case S:

			System.out.println(" Sanam Re ");
			System.out.println("=======================================");
			System.out.println("Album: Sanam Re");
			System.out.println("Duration: 5 min ");
			System.out.println("Released: 2016");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");
	


		module=br.nextLine();


		break;
		case H1:

			System.out.println(" High Rated Gabru ");
			System.out.println("=======================================");
			System.out.println("Album: Nawabzaade");
			System.out.println("Duration: 6 min ");
			System.out.println("Released: 2017");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");



		module=br.nextLine();


		break;
		case K:

			System.out.println(" Kasam Ki Kasam ");
			System.out.println("=======================================");
			System.out.println("Album: Main Prem Ki Deewani hoon");
			System.out.println("Duration: 6 min ");
			System.out.println("Released: 2003");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");

		module=br.nextLine();


		break;
		default:
		break;
		}
		 break;
		case E:

		System.out.println(" Here's Song List ");
		System.out.println("======================");
		System.out.println("L-Love Me Like You Do");
		System.out.println("P-Perfect");
		System.out.println("I-I Wanna Grow Old with You");
		System.out.println("A1-Alone");
		System.out.println("======================");
		System.out.println("Enter your choice (L,P,I,A1) : ");

		module=br.nextLine();
		switch(submodule2.valueOf(module))
		{

		case L:


		System.out.println(" Love Me Like You Do ");
		System.out.println("=======================================");
		System.out.println("Album: When The Sun Goes Down");
		System.out.println("Duration: 5 min ");
		System.out.println("Released: 2011");
		System.out.println("M-Return to main page");
		System.out.println("=======================================");


		module=br.nextLine();
		break;

		case P:

			System.out.println(" Perfect ");
			System.out.println("=======================================");
			System.out.println("Album: By Ed Sheeran ");
			System.out.println("Duration: 5 min ");
			System.out.println("Released: 2016");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");

		module=br.nextLine();


		break;
		case I:

			System.out.println(" I Wanna Grow Old With You ");
			System.out.println("=======================================");
			System.out.println("Album: World Of Our Own");
			System.out.println("Duration: 4 min ");
			System.out.println("Released: 2001");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");


		module=br.nextLine();


		break;
		case A1:

			System.out.println(" Alone ");
			System.out.println("=======================================");
			System.out.println("Album: Marshmello ");
			System.out.println("Duration: 7 min ");
			System.out.println("Released: 2016");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");

		module=br.nextLine();


		break;
		default:
		break;
		}

		break;

		case M:

		System.out.println(" Here's Music List ");
		System.out.println("======================");
		System.out.println("A-Apsara Aali");
		System.out.println("Z-Zingaat");
		System.out.println("G-Govyachya Kinaryav");
		System.out.println("W-Wjle ki Bara");
		System.out.println("======================");
		System.out.println("Enter your choice (A,Z,G,W) : ");

		module=br.nextLine();
		switch(submodule3.valueOf(module))
		{

		case A:


			System.out.println(" Apsara Aali ");
			System.out.println("=======================================");
			System.out.println("Album: Natarang");
			System.out.println("Duration: 6 min ");
			System.out.println("Released: 2010");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");


		module=br.nextLine();

		break;

		case Z:

			System.out.println(" Zingaat ");
			System.out.println("=======================================");
			System.out.println("Album: Dhadak");
			System.out.println("Duration: 5 min ");
			System.out.println("Released: 2016");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");


		module=br.nextLine();

		break;
		case G:

			System.out.println(" Govyachya Kinaryav ");
			System.out.println("=======================================");
			System.out.println("Album: Govyachya Kinaryav");
			System.out.println("Duration: 8 min ");
			System.out.println("Released: 2018");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");


		module=br.nextLine();

		break;
		case W:


			System.out.println(" Wajle Ki Bara");
			System.out.println("=======================================");
			System.out.println("Album: Natarang");
			System.out.println("Duration: 6 min ");
			System.out.println("Released: 2010");
			System.out.println("M-Return to main page");
			System.out.println("=======================================");


		module=br.nextLine();

		break;
		default:
		break;
		}
		break;
		case Q:
		System.out.println("Thanks !!! For Visiting..... )");

		System.exit(0);
		break;
		}
		}
		}
		}
