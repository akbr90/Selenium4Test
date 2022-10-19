package prog;

public class FiboniRec {
	static int a=0, b=1, c=0;
	public static void main(String[] args) {
		int a =0 ,b=1,temp=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		fibo(5);

	}
	
	
	static void fibo(int num) {
		if(num>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			fibo(num-1);
		}
	}

}
