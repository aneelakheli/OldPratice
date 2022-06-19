class MyExcepton extends Exception{
   String str1;
  
   MyException(String str2) {
	str1=str2;
   }
   public String to String(){ 
	return ("MyException Occurred: "+str1) ;
   }
}

class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		throw new MyExcepton("This is My error Message");
	}
	catch(MyExcepton exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}