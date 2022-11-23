package web.controller.hospital;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.dto.Dept;
import web.service.face.hospital.DeptService;

@Controller
public class HospbController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//서비스 객체
	@Autowired	private DeptService deptService;
	
	@RequestMapping("/hospboard/list")
	public String hospbList(Model model) {
		logger.debug("/dept/list [GET]");
		
		//서비스 객체를 이용한 전체 부서 조회
		List<Dept> deptList = deptService.list();
				
		
		//모델값 전달
		model.addAttribute("deptList", deptList);
		
		
		//ViewName 지정
		return "hospboard/list";
	}
}
