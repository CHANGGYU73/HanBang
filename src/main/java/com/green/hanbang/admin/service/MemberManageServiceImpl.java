package com.green.hanbang.admin.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberManageServiceImpl implements MemberManageService {
    private final SqlSessionTemplate sqlSession;
}
