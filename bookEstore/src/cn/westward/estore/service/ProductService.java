package cn.westward.estore.service;

import java.util.List;

import cn.westward.estore.annotation.PrivilegeInfo;
import cn.westward.estore.domain.Product;
import cn.westward.estore.domain.User;
import cn.westward.estore.exception.PrivilegeException;

public interface ProductService {

	// 添加商品
	@PrivilegeInfo("添加商品")
	public void add(User user, Product product) throws PrivilegeException,
			Exception;

	// 查找商品
	public List<Product> findAll() throws Exception;

	// 根据id查找商品
	public Product findById(String id) throws Exception;

	// 查询销售榜单
	@PrivilegeInfo("下载榜单")
	public List<Product> findSell(User user) throws PrivilegeException,
			Exception;
}
