package oom.vo;

import java.util.List;

/**
 * 获取地区结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:16:44
 * @版本: V1.0
 *
 */
public class AreaList {
	private int total;
	
	private List<AreaVo> rows;

	public List<AreaVo> getRows() {
		return rows;
	}

	public void setRows(List<AreaVo> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
