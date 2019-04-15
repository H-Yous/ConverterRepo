class codeTwo {
	public static void main(String args[]){
		Conversions conv = new Conversions();
		//conv.decimalToBinary(13);
		conv.binaryToDecimal("1100");
	}
}


class Conversions{


	public void decimalToBinary(int A){
		int toconvert = A;
		String binary = "";
		String reversebinary = "";

		while(A/2 != 0){	
			binary = binary + A%2;
			A /= 2;
		}
		if(A%2 == 1){ binary = binary + "1"; }

		for(int i = binary.length()-1; i > -1; i--){ reversebinary = reversebinary + binary.substring(i, i+1); }

		System.out.println(toconvert + " in binary = " + reversebinary);
	
	}

	public void binaryToDecimal(String A){
		int decimal = 0;
		int j = 0;
		int two = 1;

		for(int i = A.length()-1; i > -1; i--){
			two = 1;
			for(int p = 0; p < j; p++){
				System.out.println(two);
				two *= 2;
			}
			
			decimal = decimal + (Integer.parseInt(A.substring(i, i+1))*two);
			j++;
		}

		System.out.println(decimal);



	}
}