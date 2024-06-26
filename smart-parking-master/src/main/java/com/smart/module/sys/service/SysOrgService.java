package com.smart.module.sys.service;

import com.smart.common.model.Result;
import com.smart.module.sys.entity.SysOrg;

/**
 * 机构管理
 * @author 2023
 */
public interface SysOrgService {

    Result list(SysOrg org);

    Result select(Long parentId);

    Result save(SysOrg org);

    Result delete(Long orgId);

}
