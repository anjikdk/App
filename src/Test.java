
public class Test {

	public static void main(String[] args) {
		
		int[] array = {2,3,0,4,0,5};
		int n = array.length;
		
		int count = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] != 0)
			{
				array[count++] = array[i];
			}
		}
		while(count < n)
		{
			array[count++] = 0;
		}
		
		for(int k=0; k<array.length; k++)
		{
			System.out.println(array[k]);
		}
	}
}
