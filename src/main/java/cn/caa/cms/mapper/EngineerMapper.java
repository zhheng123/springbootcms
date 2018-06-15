package cn.caa.cms.mapper;

import cn.caa.cms.domain.Engineer;

public interface EngineerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Engineer record);

    int insertSelective(Engineer record);

    Engineer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Engineer record);

    int updateByPrimaryKey(Engineer record);
}