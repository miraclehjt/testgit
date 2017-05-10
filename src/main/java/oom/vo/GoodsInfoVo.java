package oom.vo;

import java.io.Serializable;

/**
 * 商品信息vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:20:13
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class GoodsInfoVo implements Serializable {
	private int goodsid;
	private int goodscategoryid;
	private String goodsname;
	private double goodsprice;
	private double packfee;
	private int goodsattr;
	private String goodsattrcode;
	private String goodsattrname;
	private int goodsevalute;
	private int goodsstatus;
	private String goodsstatusname;
	private String goodsdesc;
	private String goodsimgpath;
	private int integral;
	
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public int getGoodscategoryid() {
		return goodscategoryid;
	}
	public void setGoodscategoryid(int goodscategoryid) {
		this.goodscategoryid = goodscategoryid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public double getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}
	public double getPackfee() {
		return packfee;
	}
	public void setPackfee(double packfee) {
		this.packfee = packfee;
	}
	public int getGoodsattr() {
		return goodsattr;
	}
	public void setGoodsattr(int goodsattr) {
		this.goodsattr = goodsattr;
	}
	public String getGoodsattrcode() {
		return goodsattrcode;
	}
	public void setGoodsattrcode(String goodsattrcode) {
		this.goodsattrcode = goodsattrcode;
	}
	public String getGoodsattrname() {
		return goodsattrname;
	}
	public void setGoodsattrname(String goodsattrname) {
		this.goodsattrname = goodsattrname;
	}
	public int getGoodsevalute() {
		return goodsevalute;
	}
	public void setGoodsevalute(int goodsevalute) {
		this.goodsevalute = goodsevalute;
	}
	public int getGoodsstatus() {
		return goodsstatus;
	}
	public void setGoodsstatus(int goodsstatus) {
		this.goodsstatus = goodsstatus;
	}
	public String getGoodsstatusname() {
		return goodsstatusname;
	}
	public void setGoodsstatusname(String goodsstatusname) {
		this.goodsstatusname = goodsstatusname;
	}
	public String getGoodsdesc() {
		return goodsdesc;
	}
	public void setGoodsdesc(String goodsdesc) {
		this.goodsdesc = goodsdesc;
	}
	public String getGoodsimgpath() {
		return goodsimgpath;
	}
	public void setGoodsimgpath(String goodsimgpath) {
		this.goodsimgpath = goodsimgpath;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
}
