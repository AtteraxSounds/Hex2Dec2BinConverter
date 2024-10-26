package week04.lab;


import java.util.Scanner;
public class Point2 {	
	
	public static void main(String[] args) {	
		final int bindec;
		int Num;
		int Num2;
		int Num3;
		int Num4;
		final int decbin;
		String hexbin="0123456789ABCDEF";
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
		 	
		 	
		
		System.out.println("Welcome to The Number Systems Conversion program!");
		System.out.println("Please enter 1 if you want to convert a Binary number to decimal or hexadecimal");
		System.out.println("Please enter 2 if you want to convert a Decimal number to hexadecimal or binary");
		System.out.println("Please enter 3 if you want to convert a Hexadecimal number to decimal or binary");
		 Scanner s = new Scanner(System.in);	    
	        Num = s.nextInt();
	       //Binary Kısmı
		 if (Num==1){	
			 System.out.println("You have selected to convert a Binary Number!");
			 System.out.println("Please write 1 if you want to convert to decimal");
			 System.out.println("Please write 2 if you want to convert to hexadecimal");
		        Num2 = s.nextInt();
		        		//Binaryden Decimal a
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
			 			 	//binary den hexadecimal a
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
			 			 	}
			 			 
		 }
			 
			 			 	
			 	//decimal kısmı
			 			 	
		 else if(Num==2) {
			 System.out.println("You have selected to convert a Decimal Number!");
			 System.out.println("Please write 1 if you want to convert to binary");
			 System.out.println("Please write 2 if you want to convert to hexadecimal");
		        Num3 = s.nextInt();
		        
		        //decimaldan binary e
		        if (Num3==1) {
		        	 decbin = s.nextInt();
					 s.close();	
					 
					 if (decbin<=255) {
						 System.out.println("Please enter your decimal number ");
						 System.out.println("Note that your number should not be equal or bigger than 256!");
						 
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
							 
					 }
					
						 
					 
				 }
		        else if (Num3==2) {
		        	 System.out.println("Please enter your decimal number ");
					 System.out.println("Note that your number should not be equal or bigger than 256!");
					 
		        	 decbin = s.nextInt();
					 s.close();	
		        //decimal hexa 
		       
					 
					 if (decbin<=255) {
						
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
							 
					 }
					 else    
						 System.out.println("Please select one of the 2 choices using 1 or 2!"); 	
				
				 }
		        
		        
		        }
			 	//hexadecimal kısmı	
		 else if(Num==3) {
			 System.out.println("You have selected to convert a Hexadecimal Number!");
			 System.out.println("Please write 1 if you want to convert to binary");
			 System.out.println("Please write 2 if you want to convert to decimal");
		        Num4 = s.nextInt();
		        
		       if(Num4==1) {
		    	  String HexTodb;
		    	   System.out.println("Please enter your decimal number ");
					 System.out.println("Note that your number should not bigger than FF!");
					 System.out.println("And Before your number you should include 0x before your number!!!");
					HexTodb = s.nextLine();
					 s.close();	
					 
									 
		       }
		         
		 }		 	
		        
			
		
		 
	}}
