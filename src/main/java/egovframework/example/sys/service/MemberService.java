package egovframework.example.sys.service;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;

public interface MemberService {

	public List<?> selectMemberList(SampleDefaultVO searchVO) throws Exception;
}
