package com.hjt.waimai;


import oom.common.ApiUtils;
import oom.common.Constants;
import oom.common.JsonMapper;
import oom.vo.ShopDetailList;

public class TestApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = ApiUtils.sendPost("http://120.55.97.238:8088/waimai"+Constants.APP_SHOP_DETAIL_URL, "SHOP_ID=4", true);
		ShopDetailList d = JsonMapper.fromJson(result, ShopDetailList.class);
		System.out.println(d);
	}

}
