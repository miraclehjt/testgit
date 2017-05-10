package oom.vo;

import java.io.Serializable;

/**
 * 商店类别（口味）vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:31
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class ShopTypeVo implements Serializable {
	private Integer shoptype;
	private String shoptypename;
	private String ccode;
	private String cname;
	
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getShoptype() {
		return shoptype;
	}
	public void setShoptype(Integer shoptype) {
		this.shoptype = shoptype;
	}
	public String getShoptypename() {
		return shoptypename;
	}
	public void setShoptypename(String shoptypename) {
		this.shoptypename = shoptypename;
	}
	
	
}
