package egovframework.example.sys.service.impl;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;


@Mapper("memberMapper")
public interface MemberMapper {

	public List<?> selectMemberList(SampleDefaultVO searchVO) throws Exception;
	
	public String selectTest() throws Exception;
	
	public String getVersion() throws Exception;
	
}
