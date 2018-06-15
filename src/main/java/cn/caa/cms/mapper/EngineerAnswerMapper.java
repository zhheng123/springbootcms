package cn.caa.cms.mapper;

import cn.caa.cms.domain.EngineerAnswer;

public interface EngineerAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EngineerAnswer record);

    int insertSelective(EngineerAnswer record);

    EngineerAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EngineerAnswer record);

    int updateByPrimaryKey(EngineerAnswer record);
}