package Chap02;

class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name); // name
		System.out.println(name.getClass().getCanonicalName());
//		System.out.println(s.getClass().getSimpleName());
		System.out.println(str); //str
		System.out.println(str.getClass().getCanonicalName());
		System.out.println(7 + " "); // "7"
		System.out.println(" " +","+ 7); // " ","7"
		System.out.println(7 + ","+""); //  "7"
		System.out.println("" +","+ 7); //  "7" 
		System.out.println("" + ""); // ""
		System.out.println(7 + 7 + ""); // "14"
		System.out.println("" + 7 + 7); // "77"
	}
}
