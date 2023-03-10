package chapter6.A_CollectionClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
// Collection Framework
// 배열형태의 데이터를 편하게 사용할 수 있도록 해주는 Class의 집합

public class CollectionClass {

	public static void main(String[] args) {
		// Set Class
		// 집합 - 중복을 허용하지 않고 순서가 없는 형태
		
		// HashSet<E> : 중복을 허용하지 않고 순서가 없는 형태 => 순서가 없기 때문에 인덱스로 접근 불가
		Set<Integer> integerSet = new HashSet<Integer>(); // =================================LottoTest 에서 Set, List등을 응용한거 확인.============================================
		integerSet.add(4); // 배열에 값 넣어줌
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(2);
		
		Iterator<Integer> iterator = integerSet.iterator();
		
		while(iterator.hasNext()) { // 인덱스 없으니까 while문 사용
			System.out.println(iterator.next()); // 1, 2, 4
		}
		
		// TreeSet<E> : 중복을 허용하지 않고 순서가 없는 형태 + 정렬
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1122);
		treeSet.add(45235);
		treeSet.add(4234);
		treeSet.add(6453);
		treeSet.add(123);
		
		for(Integer item: treeSet) {
			System.out.println(item);
		}
		
		System.out.println("========================LIST==============================");
		
		// List : 데이터를 일렬로 나열한 구조
		// 순서가 존재하고 중복이 허용됨 (배열)
		
		// ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(0, "banana");
		
		list.set(0, "BANANA"); // 수정
		
		String removeItem = list.remove(1); // 삭제
		System.out.println(removeItem); // 삭제된 apple 출력
		
		for(int index = 0; index < list.size(); index++) { // ArrayList와 같은 Collection들은 length 대신 size로 함.
			System.out.println(list.get(index));
		}
		
		System.out.println("================MAP=======================================");
		// map
		// key와 value가 하나의 쌍으로 저장되는 구조
		// 순서가 존재하지 않음, 단 key를 사용해서 특정한 value를 가져옴.
		
		// HashMap<E, E> : 어쩔수 없는 경우에 쓰자.
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Key", "Value");
		hashMap.put("apple", "사과");
		
		System.out.println(hashMap.get("apple")); // 사과
	}

}
