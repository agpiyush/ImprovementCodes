import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		 List<Integer> l1=new ArrayList<Integer>();
		 l1.add(1);
		 l1.add(2);
		 l1.add(3);
		 l1.add(4);
		 List<Integer> l2=new ArrayList<Integer>();
		 l2.add(1);
		 l2.add(2);
		 l2.add(3);
		 l2.add(5);
		 int a[]=common(l1,l2);
		 for(int i:a)
		 System.out.println(i);
		}
		public static int[] common(List<Integer> l1, List<Integer> l2) {
		 List<Integer> l3=new ArrayList<Integer>();
		 List<Integer> l4=new ArrayList<Integer>();
		 
		 l3.addAll(l1);
		 l4.addAll(l2);
		 l1.removeAll(l2);
		 l4.removeAll(l3);
		 l1.addAll(l4);
		 
		 int o[]=new int[l1.size()];
		 for(int j=0;j<o.length;j++)
		  o[j]=l1.get(j);
		 return o;
		}
		}