package programs;

public class Replace_wel_With_lew_String {

		public static void main(String[] args) {
			String s="wel$35welabc%wela";
			char[] a = s.toCharArray();
			for (int i=0;i<a.length-2;i++) {
				if(a[i]=='w'&&a[i+1]=='e'&&a[i+2]=='l') {
					a[i]='l';		
	     			a[i+1]='e';		
	     			a[i+2]='w';		
				}
			}
			
			s=new String(a);
			System.out.println(s);
		}
}