package week04.lab;
import java.util.Scanner;
public class Hex2Dec2DinConverter {
	public static void main(String[] args) {	
		final int bindec;
		final int decbin;
			int Num;
			int Num2;
			int Num3;
			int Num4;
				int b1;
				int b2;
				int b3;
				int b4;
				int b5;
				int b6;
				int b7;
				int b8;
					int d1;
		 			int d2;
					int d3;
		 			int d4;
	 				int d5;
	 				int d6;
	 				int d7;
	 				int d8;
	 				int	dTot;
	 					int Sol;
		 				int Sag;
		 					boolean SagC;
		 					boolean SolC;
			 						char soll;
							 		char sag;
			//PROGRAM_INITIALIZE
		System.out.println("Welcome to The Number Systems Conversion program!");
		System.out.println("Please enter 1 if you want to convert a Binary number to decimal or hexadecimal");
		System.out.println("Please enter 2 if you want to convert a Decimal number to hexadecimal or binary");
		System.out.println("Please enter 3 if you want to convert a Hexadecimal number to decimal or binary");
		 Scanner s = new Scanner(System.in);	    
	        Num = s.nextInt();
	       //Binary PART
		 if (Num==1){	
			 System.out.println("You have selected to convert a Binary Number!");
			 System.out.println("Please write 1 if you want to convert to decimal");
			 System.out.println("Please write 2 if you want to convert to hexadecimal");
		        Num2 = s.nextInt();
		        		//BIN2DEC
			 			 	if (Num2==1) {
			 			 		System.out.println("Please enter your 8 digit binary number: ");
			 			 		bindec = s.nextInt();
			 			 		s.close();
			 			 		d1=(bindec/10000000)%10;
			 			 		d2=(bindec/1000000)%10;
			 			 		d3=(bindec/100000)%10;
			 			 		d4=(bindec/10000)%10;
			 			 		d5=(bindec/1000)%10;
			 			 		d6=(bindec/100)%10;
			 			 		d7=(bindec/10)%10;
			 			 		d8=bindec%10;
			 			 		d1=d1*(int)Math.pow(2,7);
			 			 		d2=d2*(int)Math.pow(2,6);
			 			 		d3=d3*(int)Math.pow(2,5);		
			 			 		d4=d4*(int)Math.pow(2,4);
			 			 		d5=d5*(int)Math.pow(2,3);
			 			 		d6=d6*(int)Math.pow(2,2);
			 			 		d7=d7*(int)Math.pow(2,1);
			 			 		d8=d8*(int)Math.pow(2,0);
			 			 		dTot= d1+d2+d3+d4+d5+d6+d7+d8;
			 			 		System.out.print("Binary Number of "+bindec);
			 			 		System.out.print(" is: "+dTot);
			 			 		}
			 			 	//BIN2HEX
			 			 	else if(Num2==2) {
			 			 		System.out.println("Please enter your 8 digit binary number: ");
			 			 		bindec = s.nextInt();
			 			 		if(bindec>11111111){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		d1=(bindec/10000000)%10;
			 			 		d2=(bindec/1000000)%10;
			 			 		d3=(bindec/100000)%10;
			 			 		d4=(bindec/10000)%10;
			 			 		d5=(bindec/1000)%10;
			 			 		d6=(bindec/100)%10;
			 			 		d7=(bindec/10)%10;
			 			 		d8=bindec%10;
								//BINARY NUMBER ERROR CHECK
			 			 		if(d1>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d2>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d2>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d3>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d4>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d5>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d6>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d7>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		if(d8>1){
			 			 			System.out.println("Please enter an 8 digit binary number!!");
			 			 			return;
			 			 		}
			 			 		
			 			 		d1=d1*(int)Math.pow(2,3);
			 			 		d2=d2*(int)Math.pow(2,2);
			 			 		d3=d3*(int)Math.pow(2,1);		
			 			 		d4=d4*(int)Math.pow(2,0);
			 			 		d5=d5*(int)Math.pow(2,3);
			 			 		d6=d6*(int)Math.pow(2,2);
			 			 		d7=d7*(int)Math.pow(2,1);
			 			 		d8=d8*(int)Math.pow(2,0);
			 			 		Sag=d8+d7+d6+d5; 
			 			 		Sol=d4+d3+d2+d1; 
			 			 		sag= 'A';
			 			 		soll = 'A';
			 			 		if (Sag==10) {
			 			 			sag=sag;
			 			 			}
			 			 			if(Sag==11) {
			 			 				sag++;
			 			 			}
			 			 			if(Sag==12) {
			 			 				sag++;
			 			 				sag++;
			 			 			}
			 			 			 if(Sag==13) {
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 			}
			 			 			 if(Sag==14) {
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 			}
			 			 			if(Sag==15) {
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 				sag++;
			 			 			}
			 			 		if (Sol==10) {
				 			 			soll=soll;
				 			 		}
				 			 		else if(Sol==11) {
				 			 			soll++;
				 			 		}
				 			 		else if(Sol==12) {
				 			 			soll++;
				 			 			soll++;
					 			 	}
				 			 		else if(Sol==13) {
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
						 			}
				 			 		else if(Sol==14) {
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
							 		}
				 			 		else if(Sol==15) {
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
				 			 			soll++;
							 		}
							//HEX BINARY BYTE SEPARATION
			 			 		if(Sag<10) {
			 			 		SagC=true;
			 			 	} 	else {
			 			 		SagC= false;	
			 			 	}
			 			 		if(Sol<10) {
			 			 		SolC=true;
			 			 	}	 else {
			 			 		SolC= false;
			 			 		
			 			 	}	
							//HEX PRINTS
			 			 	if(SagC==true && SolC==true) {
			 			 		 System.out.println("Your Binary Number :"+bindec);
			 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: "+Sol);
			 			 		System.out.print(Sag);
			 			 	}
			 			 	else if(SagC==false && SolC==true) {
			 			 		 System.out.println("Your Binary Number :"+bindec);
			 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
			 			 		System.out.print(Sol);
			 			 		System.out.print(sag);
			 			 	}
			 			 	else if(SagC==true && SolC==false) {
			 			 		 System.out.println("Your Binary Number :"+bindec);
			 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
			 			 		System.out.print(soll);
			 			 		System.out.print(Sag);
			 			 	}
			 			 	else if(SagC==false && SolC==false) {
			 			 		 System.out.println("Your Binary Number :"+bindec);
			 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
			 			 		System.out.print(soll);
			 			 		System.out.print(sag);
			 			 	}
			 			 	}else
								System.out.println("Please select one of the 2 choices using 1 or 2!");
		 }
			 	//DECIMAL PART
		 else if(Num==2) {
			 System.out.println("You have selected to convert a Decimal Number!");
			 System.out.println("Please write 1 if you want to convert to binary");
			 System.out.println("Please write 2 if you want to convert to hexadecimal");
		        Num3 = s.nextInt();
			 //DEC2BIN
		        if (Num3==1) {
					System.out.println("Please enter your decimal number ");
					System.out.println("Note that your number should not be equal or bigger than 256!");
		        	 decbin = s.nextInt();
					 s.close();
					 if (decbin<=255) {
							b1=decbin/128;
							b2=(decbin%128)/64;
							b3=((decbin%128)%64)/32;
							b4=(((decbin%128)%64)%32)/16;
							b5=((((decbin%128)%64)%32)%16)/8;
							b6=(((((decbin%128)%64)%32)%16)%8)/4;
							b7=((((((decbin%128)%64)%32)%16)%8)%4)/2;
							b8=(((((((decbin%128)%64)%32)%16)%8)%4)%2)%2;			 
							 System.out.print("Binary Number of "+decbin);
							 System.out.print(" is: "+b1);	
							 System.out.print(b2);
							 System.out.print(b3);
							 System.out.print(b4);
							 System.out.print(b5);
							 System.out.print(b6);
							 System.out.print(b7);
							 System.out.print(b8);
					 }else{
						 System.out.println("Please enter a  positive number smaller than 256!");
						 return;
					 }
				//DEC2HEX
				 }
		        else if (Num3==2) {
		        	 System.out.println("Please enter your decimal number ");
					 System.out.println("Note that your number should not be equal or bigger than 256!");
		        	 decbin = s.nextInt();
					 s.close();
					 if (decbin<=255)
					 {
							b1=decbin/128;
							b2=(decbin%128)/64;
							b3=((decbin%128)%64)/32;
							b4=(((decbin%128)%64)%32)/16;
							b5=((((decbin%128)%64)%32)%16)/8;
							b6=(((((decbin%128)%64)%32)%16)%8)/4;
							b7=((((((decbin%128)%64)%32)%16)%8)%4)/2;
							b8=(((((((decbin%128)%64)%32)%16)%8)%4)%2)%2;
							b1=b1*(int)Math.pow(2,3);
		 			 		b2=b2*(int)Math.pow(2,2);
		 			 		b3=b3*(int)Math.pow(2,1);		
		 			 		b4=b4*(int)Math.pow(2,0);
		 			 		b5=b5*(int)Math.pow(2,3);
		 			 		b6=b6*(int)Math.pow(2,2);
		 			 		b7=b7*(int)Math.pow(2,1);
		 			 		b8=b8*(int)Math.pow(2,0);
		 			 		Sag=b8+b7+b6+b5; 
		 			 		Sol=b4+b3+b2+b1; 
		 			 		sag= 'A';
		 			 		soll = 'A';
		 			 		if (Sag==10) {
		 			 			sag='A';
		 			 			}
		 			 			if(Sag==11) {
		 			 				sag++;
		 			 			}
		 			 			if(Sag==12) {
		 			 				sag++;
		 			 				sag++;
		 			 			}
		 			 			 if(Sag==13) {
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 			}
		 			 			 if(Sag==14) {
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 			}
		 			 			if(Sag==15) {
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 				sag++;
		 			 			}
		 			 		if (Sol==10) {
			 			 			soll='A';
			 			 		}
			 			 		else if(Sol==11) {
			 			 			soll++;
			 			 		}
			 			 		else if(Sol==12) {
			 			 			soll++;
			 			 			soll++;
				 			 	}
			 			 		else if(Sol==13) {
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
					 			}
			 			 		else if(Sol==14) {
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
						 		}
			 			 		else if(Sol==15) {
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
			 			 			soll++;
						 		}
		 			 		if(Sag<10) {
		 			 		SagC=true;
		 			 	} 	else {
		 			 		SagC= false;	
		 			 	}
		 			 		if(Sol<10) {
		 			 		SolC=true;
		 			 	}	 else {
		 			 		SolC= false;
		 			 		
		 			 	}
		 			 	if(SagC==true && SolC==true) {
		 			 		 System.out.println("Your Decimal Number :"+decbin);
		 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: "+Sol);
		 			 		System.out.print(Sag);
		 			 	}
		 			 	else if(SagC==false && SolC==true) {
		 			 		 System.out.println("Your Decimal Number :"+decbin);
		 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
		 			 		System.out.print(Sol);
		 			 		System.out.print(sag);
		 			 	}
		 			 	else if(SagC==true && SolC==false) {
		 			 		 System.out.println("Your Decimal Number :"+decbin);
		 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
		 			 		System.out.print(soll);
		 			 		System.out.print(Sag);
		 			 	}
		 			 	else if(SagC==false && SolC==false) {
		 			 		 System.out.println("Your Decimal Number :"+decbin);
		 			 		System.out.print(" Has been Converted to Hexadecimal and the solution is: ");
		 			 		System.out.print(soll);
		 			 		System.out.print(sag);
		 			 	}
					 }else{
						 System.out.println("Please insert a positive integer that's smaller than 256!");
					 }

				 } else
					System.out.println("Please select one of the 2 choices using 1 or 2!");
		        }
			 	//HEXPART
		 else if(Num==3) {
			 System.out.println("You have selected to convert a Hexadecimal Number!");
			 System.out.println("Please write 1 if you want to convert to decimal");
			 System.out.println("Please write 2 if you want to convert to binary");
		        Num4 = s.nextInt();
			   //HEX2DEC
		       if(Num4==1) {
		    	  String Hex;
		    	   System.out.println("Please enter your Hexadecimal number ");
					 System.out.println("Note that your number should not bigger than FF!");
					Hex = s.next();
					 s.close();
				   int num = Integer.parseInt(Hex,16);
				   if (num<=255 && num >=0){
					   System.out.println("Your Decimal Number :"+Hex);
					   System.out.print(" Has been Converted to Hexadecimal and the solution is: "+num);
				   } else {
					   System.out.print(" Please enter a positive hexadecimal number smaller than FF! ");
				   }
		       } else  if(Num4==2) {
				   String Hex2;
				   System.out.println("Please enter your Hexadecimal number ");
				   System.out.println("Note that your number should not bigger than FF!");
				   Hex2 = s.next();
				   s.close();
				   int decbin1 = Integer.parseInt(Hex2,16);
				   if (decbin1<=255) {
					   b1=decbin1/128;
					   b2=(decbin1%128)/64;
					   b3=((decbin1%128)%64)/32;
					   b4=(((decbin1%128)%64)%32)/16;
					   b5=((((decbin1%128)%64)%32)%16)/8;
					   b6=(((((decbin1%128)%64)%32)%16)%8)/4;
					   b7=((((((decbin1%128)%64)%32)%16)%8)%4)/2;
					   b8=(((((((decbin1%128)%64)%32)%16)%8)%4)%2)%2;
					   System.out.print("Binary Number of "+decbin1);
					   System.out.print(" is: "+b1);
					   System.out.print(b2);
					   System.out.print(b3);
					   System.out.print(b4);
					   System.out.print(b5);
					   System.out.print(b6);
					   System.out.print(b7);
					   System.out.print(b8);
				   System.out.println("Your Decimal Number :"+Hex2);
				   System.out.print(" Has been Converted to Hexadecimal and the solution is: "+decbin1);
			   }
			   }
			   else if(Num4!=1&&Num4!=2) {
				   System.out.println("Please select one of the menus using integers 1 or 2");
				   return;
			   }

		 }	else if(Num!=1&&Num!=2&&Num!=3) {
			 System.out.println("Please select one of the menus using integers 1, 2 or 3!");
			 return;
	}
	}
}
