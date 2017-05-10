package oom.vo;

import java.io.Serializable;

/**
 * 商店信息vo
 * @author huangjt
 *
 */
@SuppressWarnings("serial")
public class ShopInfoVo implements Serializable {
	private Integer shopid;
	private String shopname;
	private String shopmphone;
	private Integer shoptype;
	private String shoptypecode;
	private String shoptypename;
	private Integer paytype;
	private String paytypecode;
	private String paytypename;
	private Integer shopstatus;
	private String shopstatusname;
	private int shopevaluate;
	private String shopdesc;
	private String shopimgpath;
	private String areacode;
	private String shopaddr;
	private String minmoney;
	private String sendintime;
	private String sendmoney;
	private int isexcellent;
	private int iscoupon;
	private int ordidx;
	
	public Integer getShopid() {
		return shopid;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopmphone() {
		return shopmphone;
	}
	public void setShopmphone(String shopmphone) {
		this.shopmphone = shopmphone;
	}
	public Integer getShoptype() {
		return shoptype;
	}
	public void setShoptype(Integer shoptype) {
		this.shoptype = shoptype;
	}
	public String getShoptypecode() {
		return shoptypecode;
	}
	public void setShoptypecode(String shoptypecode) {
		this.shoptypecode = shoptypecode;
	}
	public String getShoptypename() {
		return shoptypename;
	}
	public void setShoptypename(String shoptypename) {
		this.shoptypename = shoptypename;
	}
	public Integer getPaytype() {
		return paytype;
	}
	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}
	public String getPaytypecode() {
		return paytypecode;
	}
	public void setPaytypecode(String paytypecode) {
		this.paytypecode = paytypecode;
	}
	public String getPaytypename() {
		return paytypename;
	}
	public void setPaytypename(String paytypename) {
		this.paytypename = paytypename;
	}
	public Integer getShopstatus() {
		return shopstatus;
	}
	public void setShopstatus(Integer shopstatus) {
		this.shopstatus = shopstatus;
	}
	public String getShopstatusname() {
		return shopstatusname;
	}
	public void setShopstatusname(String shopstatusname) {
		this.shopstatusname = shopstatusname;
	}
	public String getShopdesc() {
		return shopdesc;
	}
	public void setShopdesc(String shopdesc) {
		this.shopdesc = shopdesc;
	}
	public String getShopimgpath() {
		return shopimgpath;
	}
	public void setShopimgpath(String shopimgpath) {
		this.shopimgpath = shopimgpath;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getShopaddr() {
		return shopaddr;
	}
	public void setShopaddr(String shopaddr) {
		this.shopaddr = shopaddr;
	}
	public String getMinmoney() {
		return minmoney;
	}
	public void setMinmoney(String minmoney) {
		this.minmoney = minmoney;
	}
	public String getSendintime() {
		return sendintime;
	}
	public void setSendintime(String sendintime) {
		this.sendintime = sendintime;
	}
	public String getSendmoney() {
		return sendmoney;
	}
	public void setSendmoney(String sendmoney) {
		this.sendmoney = sendmoney;
	}
	public int getIsexcellent() {
		return isexcellent;
	}
	public void setIsexcellent(int isexcellent) {
		this.isexcellent = isexcellent;
	}
	public int getIscoupon() {
		return iscoupon;
	}
	public void setIscoupon(int iscoupon) {
		this.iscoupon = iscoupon;
	}
	public int getOrdidx() {
		return ordidx;
	}
	public void setOrdidx(int ordidx) {
		this.ordidx = ordidx;
	}
	public int getShopevaluate() {
		return shopevaluate;
	}
	public void setShopevaluate(int shopevaluate) {
		this.shopevaluate = shopevaluate;
	}
	
	
}
