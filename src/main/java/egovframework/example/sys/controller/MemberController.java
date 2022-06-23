package egovframework.example.sys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sys.service.MemberService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
@RequestMapping("/member")
public class MemberController {

	private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	
	@RequestMapping("/list.do")
	@ResponseBody
	public String memberList() {
		LOG.debug("@@@@@@ #### memberList() begin <---------");
		LOG.debug("@@@@@@ #### memberList() memberService:" + memberService);
		LOG.debug("@@@@@@ #### memberList() end <---------");
		
		return "Member";
	}
	
	// json
	@RequestMapping("/members.do")
	//@ResponseBody
	public String members(@ModelAttribute("searchVO") SampleDefaultVO searchVO, ModelMap model) throws Exception {
		LOG.debug("@@@@@@ #### memberList() begin <---------");
		LOG.debug("@@@@@@ #### memberList() memberService:" + memberService);
		LOG.debug("@@@@@@ #### memberList() end <---------");
		
		List<EgovMap> list = (List<EgovMap>) memberService.selectMemberList(searchVO);
		
		//jsonObject
		model.addAttribute("memberList", list);
		
		// jsonObject
		return "member/list";
	}
	
}
