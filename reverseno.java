/**
 * 
 */

/**
 * @author RahulSingh
 *
 */
public class reverseno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int number = 6589;
	    int reversedNumber = 0;
	    int temp;
	    while(number>0){
	    	temp=number%10;
	    	reversedNumber= reversedNumber*10+temp ;
	    	number = number/10;	
	    }
	    System.out.println("Reversed Number is:"+ reversedNumber);
	}
	}

