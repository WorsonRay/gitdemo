package com.example.jpademo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.jpademo.pojo.ActivityAttachfile;


//
public interface UserRepository extends PagingAndSortingRepository<ActivityAttachfile, Long> {
	public List<ActivityAttachfile> findByInfoTypeLike(String infoType);
}
