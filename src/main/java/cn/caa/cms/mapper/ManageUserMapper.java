package cn.caa.cms.mapper;

import cn.caa.cms.domain.ManageUser;

public interface ManageUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManageUser record);

    int insertSelective(ManageUser record);

    ManageUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManageUser record);

    int updateByPrimaryKey(ManageUser record);
}