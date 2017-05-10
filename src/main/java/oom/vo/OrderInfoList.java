package oom.vo;

import java.util.List;

/**
 * 订单信息结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:17:52
 * @版本: V1.0
 *
 */
public class OrderInfoList {
	private int total;
	
	private List<OrderInfoVo> rows;

	public List<OrderInfoVo> getRows() {
		return rows;
	}

	public void setRows(List<OrderInfoVo> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
