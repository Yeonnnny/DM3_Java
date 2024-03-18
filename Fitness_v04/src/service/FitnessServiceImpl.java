package service;

import java.util.ArrayList;
import java.util.List;

import vo.Fitness;

public class FitnessServiceImpl implements FitnessService{ // UI로부터 값을 전달 받는 클래스
	// 객체 배열 (CRUD)

	List<Fitness> members = new ArrayList<>();
	
	/**
	 * 파라미터로 전달된 Fitness 객체를 객체 배열에 저장
	 * 
	 * @param fitness : 객체 배열에 저장할 정보
	 * @return : 저장여부
	 */
	public boolean insert(Fitness fitness) {
		members.add(fitness);
		return true;
	}

	/**
	 * id를 전달 받아 객체 배열 내에 해당 아이디를 검색하여 결과 반환
	 * 
	 * @param id : 검색할 ID
	 * @return : 검색결과
	 */
	public Fitness selectOne(String id) {
		int searchIndex = search(id);
		return members.get(searchIndex);
	}

	/**
	 * 파라미터로 전달된 Fitness데이터를 배열에서 검색하여 데이터(키, 몸무게) 수정
	 * 
	 * @param fitness : 수정하고자 하는 데이터
	 * @return : 수정 결과
	 */
	public boolean update(Fitness fitness) {

		int searchIndex =  search(fitness.getId());
		members.get(searchIndex).setHeight(fitness.getHeight());
		members.get(searchIndex).setWeight(fitness.getWeight());
		
		return true; // 오류 가능성을 UI에서 막음
	}

	/**
	 * id를 전달받아 배열에서 해당 아이디 검색 후 삭제
	 * 
	 * @param id : 삭제하려는 ID 값 (키)
	 * @return : 삭제 여부
	 */
	public boolean delete(String id) {
		int searchIndex = search(id);
		members.remove(searchIndex);
		return true;
	}

	/**
	 * 배열 전체를 반환
	 * 
	 * @return : 배열
	 */
	public Fitness[] selectAll() {
		
		Fitness[] mems = new Fitness[members.size()];
		
		return members.toArray(mems);
	}
	
	
	/**
	 * 파라미터로 전달받은 아이디를 객체 배열에서 검색 위치값을 반환하는 메소드
	 * 
	 * @param id : 검색하기 위한 아이디
	 * @return : 객체의 배열내 위치값을 정수로 반환
	 */
	public int search(String id) {
		int searchIndex = -1;
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(id)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
	}
	
	/**
	 * 현재까지 존재하는 객체배열의 크기 반환
	 * @return
	 */
	public int getCount() {
		return members.size();
	}

}// end FitnessService class
