package com.ch.cinephile.dao;

import java.util.List;

import com.ch.cinephile.model.Motaglink;

public interface MotaglinkDao {

	void insert(Motaglink motaglink);

	List<Motaglink> selectTag(int mo_num);

	void deleteTagnum(int tag_num);

}
