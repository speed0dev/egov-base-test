package egovframework.example.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sys.service.MemberService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

// extends EgovAbstractServiceImpl <-- 추가하지 않는가?
@Service("memberService")
public class MemberServiceImpl implements MemberService {

	private static final Logger LOG = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Resource(name="memberMapper")
	MemberMapper memberMapper;
	
	
	//
	@Override
	public List<?> selectMemberList(SampleDefaultVO searchVO) throws Exception{
		
		return memberMapper.selectMemberList(searchVO);
		//return null;
		
	}
	
}
