package oom.vo;

import java.io.Serializable;

/**
 * 配送地址信息vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:51
 * @版本: V1.0
 * 
 */
@SuppressWarnings("serial")
public class AddressVo implements Serializable {
	private int addrid;
	private String addrcode;
	private String addrname;
	private String addr;
	private String mphone;
	private String mphonespare;
	private boolean isdefault;// 1-yes 0-no

	public int getAddrid() {
		return addrid;
	}

	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMphonespare() {
		return mphonespare;
	}

	public void setMphonespare(String mphonespare) {
		this.mphonespare = mphonespare;
	}

	public boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}

}
