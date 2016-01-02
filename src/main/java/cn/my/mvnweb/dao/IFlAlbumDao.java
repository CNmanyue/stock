package cn.my.mvnweb.dao;

import java.util.List;

import cn.my.mvnweb.entity.FlAlbum;

public interface IFlAlbumDao {

	public List<FlAlbum> findByUserId(String userId,Integer limit);
	
	public Integer save(FlAlbum album);
	
	public FlAlbum findById(Integer albumId);
}
