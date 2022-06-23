package egovframework.example.sys.data.mapper;

import egovframework.example.sys.data.vo.DataInfoVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("dataInfoMapper")
public interface DataInfoMapper {
	
	public String selectTest() throws Exception;
	
	public int insertDataInfo(DataInfoVO vo) throws Exception;
	

}
