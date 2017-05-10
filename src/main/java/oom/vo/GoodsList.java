package oom.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 商品信息列表结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:20:29
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class GoodsList implements Serializable {
	private int total;
	private List<GoodsInfoVo> rows;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<GoodsInfoVo> getRows() {
		return rows;
	}
	public void setRows(List<GoodsInfoVo> rows) {
		this.rows = rows;
	}
	
	
}
