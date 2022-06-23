package egovframework.example.sample.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.example.sample.service.SampleDefaultVO;

@Controller
public class SampleController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String selectSampleList(@ModelAttribute("searchVO") SampleDefaultVO searchVO, ModelMap model) throws Exception {
		LOG.debug("########### @@@@@@@@@@@@@@@@@");
		
		
		return "AAAAAAAAAAA BBBB";
	}

}
