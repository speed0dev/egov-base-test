package mapper;



import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import egovframework.example.sys.service.impl.MemberMapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@RunWith(SpringJUnit4ClassRunner.class) //JUnit 
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/resources/egovframework/spring/*.xml",
        "file:src/main/webapp/WEB-INF/config/egovframework/springmvc/dispatcher-servlet.xml" })
public class MapperTest {

	//
	@Resource(name="memberMapper")
	MemberMapper memberMapper;
	
	@Test
	public void callTest() throws Exception {
		System.out.println("@@ callTest() <-- ");
		String result = memberMapper.selectTest();
		String version = memberMapper.getVersion();
		System.out.println("@ result:" + result + " ver:" + version);
	}
	
	
	@Test
	//@Commit
	public void listMembers() throws Exception{
		
		List<EgovMap> list = (List<EgovMap>) memberMapper.selectMemberList(null);
		System.out.println("@@ list size:" + list.size());
		
		for(EgovMap m: list) {
			System.out.println(m.toString());
		}
		
	}

}
