package Lab10;

public class substring {
	
	public static int countSub(String main, String sub) {
		if(main.length()< sub.length()) {
			return 0;
		}else if (main.startsWith(sub)) {
			return 1 + countSub(main.substring(1),sub);
		}else {
			return countSub(main.substring(1),sub);
		}	
	}
}
