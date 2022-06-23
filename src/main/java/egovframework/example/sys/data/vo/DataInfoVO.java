package egovframework.example.sys.data.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class DataInfoVO {
	
	String sysId;
	String sysName;
	String sysInfo;
	String sysVer;
	String useYn;
	String createDt;
	double pow;
	
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getSysInfo() {
		return sysInfo;
	}
	public void setSysInfo(String sysInfo) {
		this.sysInfo = sysInfo;
	}
	public String getSysVer() {
		return sysVer;
	}
	public void setSysVer(String sysVer) {
		this.sysVer = sysVer;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getCreateDt() {
		return createDt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public double getPow() {
		return pow;
	}
	public void setPow(double pow) {
		this.pow = pow;
	}
	

}
