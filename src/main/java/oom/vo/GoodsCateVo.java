package oom.vo;

import java.io.Serializable;

/**
 * 商品类别vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:19:57
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class GoodsCateVo implements Serializable {
	private int goodscategoryid;
	private String categoryname;
	
	public int getGoodscategoryid() {
		return goodscategoryid;
	}
	public void setGoodscategoryid(int goodscategoryid) {
		this.goodscategoryid = goodscategoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
}
