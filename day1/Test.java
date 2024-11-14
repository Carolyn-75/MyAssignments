package week1.day1;

class Test {
	static int l = 0;

	public static void main(String [] args) {
		System.out.println(args[1]+" "+args[2]+" "+args[3]);
		for(int index = 0; index < 1; index++) {
			System.out.println("hello");
		}
		int i=5, j=2;
		System.out.println(i%j);
	}

	public void print() {
		System.out.println(this.l);
	}
}
