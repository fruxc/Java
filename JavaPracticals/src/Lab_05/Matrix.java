/**
 * 
 */
package Lab_05;
/**
 * Imports
 */
import java.util.Scanner;
/**
 * @author HAMMAD
 *
 */
public class Matrix {
	public int mat1[][],mat2[][],m,n;
	Matrix(int m,int n){
		this.m = m;
		this.n = n;
		this.mat1 = new int [m][n];
		this.mat2 = new int [m][n];
		System.out.println("Data for matrix 1:");
		getdata(this.mat1);
		System.out.println("Data for matrix 2:");
		getdata(this.mat2);
		System.out.println("Display matrix 1:");
		showdata(this.mat1);
		System.out.println("Display for matrix 1:");
		showdata(this.mat2);
	}
	@SuppressWarnings("resource")
	void getdata(int x[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<this.m; i++) {
			for(int j = 0; j<this.n; j++) {
				System.out.println((i+1)+" x "+(j+1)+" = ");
				x[i][j]=sc.nextInt();
			}	
		}
	}
	void showdata(int x[][]) {
		for(int i = 0; i<this.m; i++) {
			for(int j = 0; j<this.n; j++) {
				System.out.println((i+1)+"x"+(j+1)+"="+x[i][j]);
			}	
		}
	}
	void addition(){
		int res[][] = new int[this.m][this.m];
		for(int i = 0; i<this.m; i++) {
			for(int j = 0; j<this.n; j++) {
				res[i][j] = this.mat1[i][j] + this.mat2[i][j];
			}
		}
		System.out.println("Resultant Matrix:");
		showdata(res);
	}
	public static void main(String[] args) {
		int m1,n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M x N for 1st Matrix");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		Matrix mx = new Matrix(m1,n1);
		mx.addition();
		sc.close();
	}

}
