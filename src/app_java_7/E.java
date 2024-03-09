package app_java_7;

public class E {
	public static void main(String[] args) {
		try {
			int x= 10/0;			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(1000);
			
		}
	}

}
