import java.util.Arrays;
import java.util.List;

public class B {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> list2 = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15);
		
//		list1.addAll(list2);
		
		int len = list2.size();
		if(list1.size() > list2.size())
			len = list1.size();
		for(int i=0; i<len; i++)
		{
			if(i < list1.size())
			{
				System.out.println(list1.get(i));
			}
			if(i < list2.size())
			{
				System.out.println(list2.get(i));
			}
		}
	}
}
