package oom.vo;

import java.util.List;

/**
 * 商品类别查询结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:15:56
 * @版本: V1.0
 *
 */
public class GoodsCateList {
	private int total;
	
	private List<GoodsCateVo> rows;

	public List<GoodsCateVo> getRows() {
		return rows;
	}

	public void setRows(List<GoodsCateVo> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
