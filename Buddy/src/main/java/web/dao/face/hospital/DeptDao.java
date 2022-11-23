package web.dao.face.hospital;

import java.util.List;

import web.dto.Dept;

public interface DeptDao {

	/**
	 * 부서 정보 전체 조회
	 * 
	 * @return List<Dept> - 조회된 부서 정보 목록
	 */
	public List<Dept> selectAll();
	
}
