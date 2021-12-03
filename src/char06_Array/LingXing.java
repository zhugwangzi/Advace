package char06_Array;

public class LingXing {
	public static void main(String[] args) {
		//绘制边长是5个*的菱形，
		System.out.println("打印菱形");
		//先打印前5行
		for(int i=1;i<6;i++) {			 		//i是行数
			for(int j=5;j-i>0;j--) {				//j是第i行空格数
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {	//k是第i行*数
				System.out.print("*");
			}
			System.out.println();
		}
		//打印后4行
		for(int i=1;i<5;i++) {			 		//i是行数
			for(int j=1;j<=i;j++) {				//j是第i行空格数
				System.out.print("  ");
			}
			for(int k=1;k<=9-2*i;k++) {//k是第i行*数
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
