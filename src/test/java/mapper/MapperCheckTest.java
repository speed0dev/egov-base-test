package mapper;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import egovframework.example.sys.data.mapper.DataInfoMapper;
import egovframework.example.sys.data.vo.DataInfoVO;

@RunWith(SpringJUnit4ClassRunner.class) //JUnit 
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/resources/egovframework/spring/*.xml",
        "file:src/main/webapp/WEB-INF/config/egovframework/springmvc/dispatcher-servlet.xml" })
public class MapperCheckTest {

	@Resource
	private DataInfoMapper dataInfoMapper;
	
	@Test
	public void dataInfoTest() throws Exception{
		System.out.println("@@@ test() =====================");
		System.out.println(">> dataInfoMapper:" + dataInfoMapper);
		
		String test = dataInfoMapper.selectTest();
		System.out.println("test:" + test);
		
		System.out.println("================================");
	}

//-------------------------	
	@Test
	public void insertDataInfo() throws Exception{
	
		//
		DataInfoVO data = new DataInfoVO();
		data.setSysId("RRRRRR");
		data.setSysName("테스트시스템B");
		data.setSysInfo("INFO");
		data.setSysVer("1.0ver");
		data.setUseYn("Y");
		data.setPow(29.11);
		
		
		try {
			
			int result = dataInfoMapper.insertDataInfo(data);
			System.out.println(" @ result:" + result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
