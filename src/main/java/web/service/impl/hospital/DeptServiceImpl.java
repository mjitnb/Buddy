package web.service.impl.hospital;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.hospital.DeptDao;
import web.dto.Dept;
import web.service.face.hospital.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//DAO 객체
	@Autowired private DeptDao deptDao;
	
	@Override
	public List<Dept> list() {
		//부서 목록 조회
		List<Dept> deptList = deptDao.selectAll();
		
		logger.debug("deptList 조회 결과 테스트");
		for( Dept d : deptList) {
			logger.debug("{}", d);
		}
		
		//조회 결과 반환
		return deptList;
	}



}
