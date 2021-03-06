package com.imfbp.rz.dao.rzprjcontrguar;

import java.util.Map;
import java.util.List;

import com.imfbp.rz.domain.rzprjcontrguar.RzPrjcontrGuar;
import com.imfbp.rz.domain.rzprjcontrguar.query.RzPrjcontrGuarQuery;

public interface RzPrjcontrGuarDao{

	/**
	 * 添加
	 * @param rzPrjcontrGuar
	 * @return
	 */
	public void insertRzPrjcontrGuar(RzPrjcontrGuar rzPrjcontrGuar);
	
	/**
	 * 批量添加
	 * @param List<rzPrjcontrGuar>
	 * @return
	 */
	public void insertBatchRzPrjcontrGuar(List<RzPrjcontrGuar> rzPrjcontrGuarList);
	
	
	/**
	 * 根据Id删除 (真正删除数据库数据)
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public boolean deleteRzPrjcontrGuarById(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
	/**
	 * 根据条件删除 (真正删除数据库数据)
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public boolean deleteRzPrjcontrGuarByCondition(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
	/**
	 * 根据主键批量删除 (真正删除数据库数据)
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public boolean deleteRzPrjcontrGuarByBatchId(Map<String,Object> data);
	
	
	
	/**
	 * 根据Id修改
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public boolean updateRzPrjcontrGuarById(RzPrjcontrGuar rzPrjcontrGuar);
	
	/**
	 * 根据Id批量修改
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public boolean updateRzPrjcontrGuarByBatchId(List<RzPrjcontrGuar> rzPrjcontrGuarList);
	
	/**
	 * 根据条件修改
	 * @param data
	 * @return
	 */
	public boolean updateRzPrjcontrGuarByCondition(Map<String,Object> data);
	
	/**
	 * 根据id查询
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public RzPrjcontrGuar getRzPrjcontrGuarById(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
	/**
	 * 查询所有
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public List<RzPrjcontrGuar> getRzPrjcontrGuarAll(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
	/**
	 * 分页查询
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public List<RzPrjcontrGuar> getRzPrjcontrGuarByPage(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
	/**
	 * 分页查询查询总数
	 * @param rzPrjcontrGuarQuery
	 * @return
	 */
	public Integer getRzPrjcontrGuarByPageCount(RzPrjcontrGuarQuery rzPrjcontrGuarQuery);
	
}