package web.service.face.hospital;

import java.util.List;

import web.dto.Dept;

public interface DeptService {

	/**
	 * 전체 목록 조회
	 * 
	 * @return List<Dept> - 조회된 전체 부서 목록
	 */
	public List<Dept> list();
	
}
