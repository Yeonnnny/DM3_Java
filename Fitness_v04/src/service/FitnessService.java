package service;

import vo.Fitness;

public interface FitnessService {
	public static final int MAX =100; // 배열의 크기
	public boolean insert(Fitness fitness);
	public Fitness selectOne(String id);
	public boolean update(Fitness fitness);
	public boolean delete(String id);
	public Fitness[] selectAll();
	public int search(String id);
	public int getCount();
	
}
