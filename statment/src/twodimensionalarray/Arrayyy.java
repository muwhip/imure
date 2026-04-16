package twodimensionalarray;

public class Arrayyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[][] a = {
		                {10, 20, 30},
		                {40, 50, 60},
		                {15, 25, 46}
		        };

		        for (int i = 0; i < a.length; i++) {
		            for (int m = 0; m < a[i].length; m++) {

		                System.out.print(a[i][m]);

		            
		                if (m < a[i].length - 1) {
		                    System.out.print(",");
		                }
		            }
		            System.out.println();
		        }
		    }
		

}
