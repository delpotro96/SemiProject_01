package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.vo.MemberVO;

@Repository
@Mapper
public interface MemberDAO {

    MemberVO login(MemberVO memberVO) throws DataAccessException;

    List<MemberVO> selectAllMember() throws DataAccessException;

    void insertMember(MemberVO memberVO) throws DataAccessException;

    void updateMemberPw(MemberVO memberVO) throws DataAccessException;

    void deleteMember(String id) throws DataAccessException;
}


