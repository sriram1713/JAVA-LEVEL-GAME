import java.util.Random;
import instructions.rule;
import table1.alpha;
import details.ruledemo;
import java.util.Scanner;
class finalproject
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Random random=new Random();
		System.out.println("                    >>>>>>**** WELCOME TO THE MATHS MAGIC WORLD ****<<<<<<      ");
		System.out.println(" ");
		System.out.println("          <!><!><!><!><!><!>   IN THIS GAME WE HAVE 4 LEVELS   <!><!><!><!><!><!>");
		System.out.println(" ");
		System.out.println("		        ### HELLO USER,PLEASE ENTER YOUR NAME:= ###	 ");
		String name = s.nextLine();
		System.out.println(" ");
		System.out.println("       ((((((((((<----"+name+",ENTER THE BELOW HUMAN CAPTCHA BEFORE PROCEEDING---->)))))))))) ");
		int str;
		while(true)
		{
			str=random.nextInt(999);
			if(str>101)
			break;
		}
		System.out.println(" ");
		System.out.println("                  		             "+str);
		int ca=s.nextInt();
		ruledemo rd=new ruledemo();
		alpha al=new alpha();
		rule ru=new rule();
		System.out.println("                      ");
		if(ca==str)
		{
			System.out.println("            <=:=>  <=:=>  <=:=>  !!!!LEVEL 1!!!!  <=:=>  <=:=>  <=:=>");
			System.out.println("                            ======================");
			System.out.println("                      "); 
			System.out.println("==>**Follow the Instructions carefully:**<==");
			System.out.println("     ");
			System.out.println("   1)PLEASE CHOOSE A NUMBER FROM 10-99");
			System.out.println("     ");
			int t;
			rd.print();
			System.out.println("Enter the final sum answer,To find your choosen number:");
			int b=s.nextInt();
			System.out.println("     ");
			t=(b-6);
			System.out.println("Your Choosen Number is= "+t);	
			System.out.println("      ");
			System.out.println("If Your Choosen Number is "+t+" correct then press 1.If not press 0");
			System.out.println("      ");
			int a=s.nextInt();
			if(a==0)
			{
				System.out.println(":) Better Check Again");
        			System.exit(0);
				System.out.println("      ");
			}
			else
			{
				System.out.println("      ");
				System.out.println("               ******CONGRATULATIONS !!!! YOU ARE QUALIFIED FOR LEVEL 2******");
			}
        		System.out.println(" ");
			System.out.println("         ====================================================================================");
        		System.out.println("                          <=:=>  <=:=>  <=:=>  !!!!LEVEL 2!!!!  <=:=>  <=:=>  <=:=>");
        		System.out.println("                                          ======================");
        		System.out.println("                      ");
        		System.out.println("==>**Follow the Instructions carefully:**<==");
        		System.out.println("--------------------------------------");
        		int rand=0;
        		while(true)
        		{
        			rand=random.nextInt(11);
   	        		if(rand!=0)
   	        		break;
        		}
        		System.out.println("!!!! Choose any Integer number:   !!!!");
        		System.out.println("                      ");
        		double total=0;
        		double e=3;
        		ru.display(rand);
        		System.out.println("5)If you are clear with above instructions then press 1:=");
        		double j=s.nextInt();
        		if(j==1)
        		{
        			total=((((e*2)+rand)/2)-e); 
        			System.out.println("                      ");
        			System.out.println("==>Your Final Answer is "+total);
        		}
        		System.out.println("                      ");
        		System.out.println("If your answer is " +total+ " then press 1,If not press 0");
        		int f=s.nextInt();
        		if(f==1)
        		{
        			System.out.println("                      ");
            			System.out.println("<--->Thank You User<--->");
        			System.out.println("       ");
        			System.out.println("                ******CONGRATULATIONS !!!! YOU ARE QUALIFIED FOR LEVEL 3******");
    			}
    			else
    			{
        			System.out.println("==>Enter Choosen Number is:");
        			double d=s.nextInt();
        			System.out.println(+d+" * 2 = "+(d*2));
        			System.out.println(+(d*2)+" + "+rand+" = "+((d*2)+rand));
       				System.out.println(+((d*2)+rand)+ " divide by 2 = " +(((d*2)+rand)/2));
        			System.out.println("Substract " +(((d*2)+rand)/2)+ " - "+ d);
        			System.out.println("Your Final Answer is  =  "+((((d*2)+rand)/2)-d));
       				if(total==((((d*2)+rand)/2)-d));
       				{
        				System.out.println("                      "); 
          				System.out.println("Your Final Answer is Matched with the predicted value");
       				}
       				System.out.println(":( :( :( BETTER LUCK NEXT TIME  ): ): ): ):"); 
       				System.exit(0);
    			}
    			System.out.println("                      "); 
 			System.out.println("          ====================================================================================");	
    			System.out.println("                    <=:=>  <=:=>  <=:=>  !!!!LEVEL 3!!!!  <=:=>  <=:=>  <=:=>");
    			System.out.println("                      "); 
    			int barr[]={2,1,4,16,32,8};
    			System.out.println("                                     ======================");
    			System.out.println("<===>DEAR AMIGO,FOLLOW THE STEPS VERY CAREFULLY<===>");
    			System.out.println("                      ");
    			System.out.println("STEP 1) CHOOSE ANY INTEGER BETWEEN 1-60");
    			System.out.println("                      ");  
    			System.out.println("STEP 2) LOOK AT THE TABLE NUMBERS IN WHICH YOUR CHOOSEN NUMBER IS PRESENT");
    			System.out.println("                      ");
    			al.display();
    			System.out.println("                      ");
    			System.out.println("STEP 3) ENTER NUMBER OF TABLES IN WHICH YOUR CHOOSEN NUMBER IS PRESENT:");
    			int h=s.nextInt();
    			int[] arr =new int[h];
    			int i=0;
    			int sc=0;
    			System.out.println("                      ");
    			System.out.println("STEP 4) ENTER TABLE NUMBERS:");
    			for(i=0;i<h;i++)
    			{
       				int to=s.nextInt();
       				sc+=barr[to-1];
    			}
    			System.out.println("                      ");
    			System.out.println("                ##### ANSWER IS LOADING.....###");
    			System.out.println("                      ");
    			System.out.println("            YOUR CHOOSEN NUMBER IS ="+sc);
    			System.out.println("                      ");
    			System.out.println("IF YOUR ANSWER IS " +sc+ " THEN PRESS 1,IF NOT PRESS 0");
    			int z=s.nextInt();
    			if(z==1)
    			{
       				System.out.println("          ******CONGRATULATIONS AMIGO!!!! YOU CAN MOVE TO LEVEL 4******");
       				System.out.println("                      ");
    			}
    			else
    			{
   
       				System.out.println("!!!!!!BETTER LUCK NEXT TIME !!!!!");
       				System.exit(0);
    			}
    			System.out.println("       ====================================================================================");	
    			System.out.println("                    <=:=>  <=:=>  <=:=>  !!!!LEVEL 4!!!!  <=:=>  <=:=>  <=:=>");
    			System.out.println("             		   	   **||| 	WELCOME USER     |||**    ");
			System.out.println("                               	  ====================================");
			System.out.println("                              IN THIS MAGIC TRICK,YOU WILL BE PLAYING WITH COMPUTER");
			System.out.println("");
			System.out.println("                   BY THE FIRST COMPUTER'S INPUT,THE FINAL SUM ANSWER IS GOING TO BE PREDICTED");
			System.out.println("");
			System.out.println("   TO CHECK THE PREDICTED FINAL ANSWER,ADDITION OPERATION WILL BE PERFORMED WITH COMPUTER'S INPUT VALUES AND YOUR INPUT VALUES");
			System.out.println("");
			System.out.println("       !!!!!!!!!!!!  AT BEGINING COMPUTER WILL BE ENTER A VALUE ,AFTER THAT U CAN PROCEED WITH YOUR INPUT VALUES!!!!!!!!!");
			System.out.println("");
			System.out.println("*****NOW COMPUTER'S FIRST INPUT IS:=******");
			System.out.println("");	
			int pred=0;
			while(true)
      			{
        			pred=random.nextInt(99999);
   	        		if(pred>=10000)
   	        		break;
			}
  			int preds=pred-2;
     			System.out.println(pred);
    			System.out.println("WITH THE FIRST COMPUTER'S INPUT,THE FINAL ANSWER IS PREDICTED BEFORE PERFORMING OPERATIONS ON VALUES");
    			System.out.println("");
    			System.out.println(" 		             1)"+pred+"<-----(COMPUTER'S) FIRST INPUT VALUE");
    			System.out.println("			     2)	       <-----(USER) FIRST INPUT VALUE");
    			System.out.println("			     3)	       <-----(COMPUTER'S) SECOND INPUT VALUE");
    			System.out.println("			     4)	       <-----(USER) FINAL INPUT VALUE");
    			System.out.println("			     5)        <-----(COMPUTER) FINAL INPUT");
    			System.out.println("				====== ");
    			System.out.println("	******FINAL ANSWER:=  2"+preds+"<-----(THIS IS THE FINAL PREDICTED ANSWER)");
    			System.out.println("*******************************************");
    			System.out.println("===>~~~~~~***** SO ITS YOUR TURN *****~~~~~~ ");
    			System.out.println("");
    			System.out.println("===>ENTER 1ST FIVE DIGITED NUMBER");
    			int af=s.nextInt();
    			int bg=0;
    			int alen=String.valueOf(af).length();
    			if(alen==5)
    			{
        			System.out.println("   "+pred+"  <-----(COMPUTER'S) FIRST INPUT VALUE");
        			System.out.println("   "+af+"<-----(USER) FIRST INPUT VALUE");
        			System.out.println("");
        			System.out.println("");
        			System.out.println("");
        			System.out.println(" =======");
        			System.out.println(" 2"+preds+"");
        			System.out.println("");
				System.out.println("******************************************************************");
				System.out.println("");
				bg=99999-af;
				System.out.println("COMPUTER'S SECOND INPUT VALUE");
				System.out.println("   "+pred+"  <-----(COMPUTER'S) FIRST INPUT VALUE");
				System.out.println("   "+af+"<-----(USER) FIRST INPUT VALUE");
				System.out.println("   "+bg+"<-----(COMPUTER'S) SECOND INPUT VALUE");
				System.out.println("");
				System.out.println("");
				System.out.println(" =======");
				System.out.println(" 2"+preds+"");
				System.out.println("");
				System.out.println("******************************************************************");
				System.out.println("");
   			}
  			else
  			{
       				System.out.println("!!!!!ERROR := ENTER EXACT FIVE DIGIT VALUE !!!!!");
  			}
  			System.out.println("===>ENTER 2ND FIVE DIGITED NUMBER"); 
  			int c=s.nextInt();
  			int clen=String.valueOf(c).length();
  			if(clen==5)
  			{
     				System.out.println("   "+pred+"  <-----(COMPUTER'S) FIRST INPUT VALUE");
     				System.out.println("   "+af+"<-----(USER) FIRST INPUT VALUE");
     				System.out.println("   "+bg+"<-----(COMPUTER'S) SECOND INPUT VALUE");
     				System.out.println("   "+c+"<-----(USER) FINAL INPUT VALUE");
     				System.out.println("");
     				System.out.println("  =======");
     				System.out.println("  2"+preds+""); 
     				System.out.println("");
     				System.out.println("******************************************************************");
     				System.out.println("");
     				int d=0;
     				d=99999-c;
     				System.out.println("COMPUTER'S THIRD(FINAL) INPUT VALUE");
     				System.out.println("   "+pred+"  <-----(COMPUTER'S) FIRST INPUT VALUE");
     				System.out.println("   "+af+"<-----(USER) FIRST INPUT VALUE");
     				System.out.println("   "+bg+"<-----(COMPUTER'S) SECOND INPUT VALUE");
     				System.out.println("   "+c+"<-----(USER) FINAL INPUT VALUE");
     				System.out.println("   "+d+"<-----(COMPUTER) FINAL INPUT");
     				System.out.println("  =======");
     				System.out.println("  2"+preds+""); 
     				System.out.println("");
     				System.out.println("******************************************************************");
     				System.out.println("");
     				System.out.println("CHECK ALL THE VALUES AND PERFORM ADDITION TO GET THE OUTPUT 2"+preds+".IF YOUR ANSWER IS MATCHED WITH PREDICTED VALUE THEN PRESS 1 IF NOT PRESS 0");
     				System.out.println("");
     				int fp=s.nextInt();
    				if(fp==1)
   				{
           				System.out.println("         <=><=><=><=>CONGRATULATIONS USER<=><=><=><=>");
   				}
   				else
   				{ 
         				System.out.println("!!!!!!!!CHECK AGAIN AND DO OPERATIONS CAREFULLY!!!!!!!!");
   				}
 			}
 			else
 			{
        			System.out.println("!!!!!ERROR := ENTER EXACT FIVE DIGIT VALUE !!!!!");
 			}
 			System.out.println(":) :) :) :)PLEASE RATE US FROM 1-5(: (: (: (:");
 			float y=s.nextFloat();
 			if(y>=3)
 			{
 				System.out.println("<><><><><><><>   THANK YOU VERY MUCH FOR YOUR PARTICIPATION   <><><><><><><>");
 			}
 			else
 			{
 				  System.out.println("): SORRY FOR YOUR INCONVIENCE.WE WILL TRY TO UPDATE IT SOON:(");
 			}
		}
		else
		{
			System.out.println("<<<<YOU ARE NOT A HUMAN>>>>");
		}
	}
}
