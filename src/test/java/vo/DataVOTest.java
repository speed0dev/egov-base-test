package vo;

import org.junit.Test;

import egovframework.example.sys.data.vo.DataInfoVO;


public class DataVOTest {
	
	//
	@Test
	public void callTest() {
		System.out.println("@@ call() ");
		DataInfoVO data = new DataInfoVO();
		data.setPow(10.29);
		
		System.out.println( ">>> " + data.getPow() );
		
	}

}
