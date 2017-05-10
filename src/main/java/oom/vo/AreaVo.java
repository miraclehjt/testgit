package oom.vo;

import java.io.Serializable;

/**
 * 地区信息vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:51
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class AreaVo implements Serializable {
	private String addrcode;
	private String addrname;
	private int ordidx;
	private String parcode;
	
	public String getAddrcode() {
		return addrcode;
	}
	public void setAddrcode(String addrcode) {
		this.addrcode = addrcode;
	}
	public String getAddrname() {
		return addrname;
	}
	public void setAddrname(String addrname) {
		this.addrname = addrname;
	}
	public int getOrdidx() {
		return ordidx;
	}
	public void setOrdidx(int ordidx) {
		this.ordidx = ordidx;
	}
	public String getParcode() {
		return parcode;
	}
	public void setParcode(String parcode) {
		this.parcode = parcode;
	}
	
}
