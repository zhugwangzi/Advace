package char17_enum;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Test2<T extends List> {
	public static void main(String[] args) {
		Test2<ArrayList> t1=new Test2<ArrayList>();
		Test2<LinkedList> t2=new Test2<LinkedList>();
		Test2<?> t3=new Test2<LinkedList>();
	}

}
