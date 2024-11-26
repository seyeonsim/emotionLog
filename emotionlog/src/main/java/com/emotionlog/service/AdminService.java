package com.emotionlog.service;

import java.util.List;

import com.emotionlog.domain.DiaryCountsVO;
import com.emotionlog.domain.UsersVO;

public interface AdminService {
	
	// 전체 회원 리스트 조회
	public List<UsersVO> getUserList() throws Exception;
	
	// 날짜별 작성된 일기 갯수
	public List<DiaryCountsVO> getDiaryCountsByDateRange() throws Exception;


}
