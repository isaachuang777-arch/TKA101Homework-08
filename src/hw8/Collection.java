package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)

public class Collection {

	// 資料有重複，不適合用Set

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		System.out.println("-----------列印集合內容-----------");

		System.out.print("Iterator: ");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}

		System.out.println();
		System.out.print("for迴圈: ");

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + "\t");
		}

		System.out.println();
		System.out.print("foreach: ");

		for (Object element : list) {
			
			System.out.print(element + "\t");

		}
		
		// 排除非java.lang.Number相關的物件
		
		Iterator moveOut = list.iterator();
		
		while(moveOut.hasNext()) {
			Object element = moveOut.next();
			
			if(!(element instanceof Number)) {
				
				moveOut.remove();
			}
		}
		
		// 印出去除非Number的集合內容
		
		System.out.println();
		System.out.print("Number物件: ");
		
		for(Object element : list) {
			System.out.print(element+"\t");
		}
	}

}
