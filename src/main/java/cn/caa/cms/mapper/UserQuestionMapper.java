package cn.caa.cms.mapper;

import cn.caa.cms.domain.UserQuestion;

public interface UserQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserQuestion record);

    int insertSelective(UserQuestion record);

    UserQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserQuestion record);

    int updateByPrimaryKey(UserQuestion record);
}