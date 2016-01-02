package cn.my.mvnweb.dao;

import java.util.List;

import cn.my.mvnweb.entity.FlPhoto;

public interface IFlPhotoDao {

	public Integer savePhoto(FlPhoto fp);
	
	public FlPhoto getPhotoById(Integer id);
	
	public List<FlPhoto> getNextPhoto(Long albumId,Integer orderNo);
	
	public List<FlPhoto> getPreviousPhoto(Long albumId,Integer orderNo);
	
	public void deleteById(Integer id);
}
