package Lab13;

//EZBERLE
public class Ex3_MXNgrid {

	public static void main(String[] args) {
		
		 int m = 3, n = 3; 
	     System.out.println("Benzersiz Yolların Sayısı: " + countPaths(m, n));
	}

	public static int countPaths(int m, int n) {
		
        if (m == 1 || n == 1) {
            return 1;
        }
        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }
}
