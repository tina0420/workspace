package exam;

public class Bubble {

	public static void main(String[] args) {
		int[] numbers = {45,81,9,72,4,6,};
		for (int i=0; i<numbers.length-1; i++){
			for (int j=i+1; j<numbers.length; j++){
				if(numbers[i]<numbers[j]){
					int tmp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=tmp;
			}
			}
		}
        System.out.print("<strong>");    
		for (int number : numbers){
            	System.out.print(number+" ");
            }
	}

}
