package com.zb.mapper;

import com.zb.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    //教师及测试
    public List<Dept> findDeptList();
}
