package pratice;
import java.util.HashSet;
public class repeatingWordintheString {
	public static void main(String[] args) {
		String str="This is is  checked";
		String StrAry []=str.split(" ");
		HashSet<String> set = new HashSet();
		for (int i=0;i<=StrAry.length-1;i++) {
			set.add(StrAry[i]);
		}
			for (String stringword : set) {
				int count=0;
				for (int i=0;i<StrAry.length;i++) {
				if(stringword.equals(StrAry[i]))
				{
				count++;
			}
		}
				if(count>=2) {
			System.out.println("WORD "+stringword+" IS REPEATED "+count);	
		}
			}
		}
	}
