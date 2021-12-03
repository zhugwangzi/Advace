package char06_Array;

public class LingXing1 {
	public static void main(String[] args) {
		/*绘制一个用*构成的空心菱形，
		 * 修改边长参数a可以控制菱形的大小*/
		
		int a=7;//这里可以修改a的值
		//先打印菱形的前a行
		/*打印完第i行的a-i个空格后
		   *再打印一个* */
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
				}
			System.out.print("*");
		/*打印第i行的2i-3个空格后
		  *再打印一个* */
			for(int k=1;k<=2*i-3;k++) {
				System.out.print(" ");
			}
			if(i==1) {//第一行直接换行，否则打印*再换行
				System.out.println();
			}else {
				System.out.println("*");
			}
		}
		//打印后面的a-1行
		/*打印第i行的i个空格，再打印一个**/
		for(int i=1;i<a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				}
			System.out.print("*");
		/*打印第i行的2(a-i)-3个空格后,再打印一个* */
			for(int k=1;k<=2*(a-i)-3;k++) {
				System.out.print(" ");
			}
			if(i==a-1) {//若是最后一行，直接结束循环，否则打印*再换行
				break;
			}else {
				System.out.println("*");
			}
		}
	}
}
