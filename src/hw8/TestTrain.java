package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	
	public static void main(String[] args) {
		
		//在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
		
		Train[] trains = {
				
				new Train(202, "普悠瑪", "樹林", "花蓮", 400),
				new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500),
				new Train(1288, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600),
				new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700),
		};
		
		//------------------印出不重複的Train物件------------------
		
		System.out.println("--------------印出不重複的Train物件/使用迭代器--------------");
		System.out.println();
		Set<Train> trainSet = new HashSet<Train>();
		for(Train t : trains) trainSet.add(t);
		
		Iterator<Train> it = trainSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		//------------------印出班次由大到小------------------
		System.out.println();
		System.out.println("--------------印出班次由大到小/使用for迴圈--------------");
		System.out.println();
		List<Train> trainList = new ArrayList<Train>();
		for(Train t : trains) trainList.add(t);
		Collections.sort(trainList);
		
		for(int i = 0; i < trainList.size();i++) {
			System.out.println((trainList.get(i)));
		}
		
		//------------------印出班次由大到小且不得重復------------------
		System.out.println();
		System.out.println("--------------印出班次由大到小且不得重復/forEach--------------");
		System.out.println();
		Set<Train> trainSet2 = new TreeSet<Train>();
		for(Train t : trains) trainSet2.add(t);
		
		for(Train t : trainSet2) {
			System.out.println(t);
		}
		
	}

}
