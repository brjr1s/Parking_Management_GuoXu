package com.smart.module.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
import com.smart.module.sys.entity.SysRoleOrg;

/**
 * sys_role_org Repository
 * Created by 2023
 * Sun Oct 27 13:02:54 CST 2023
*/ 
@Repository 
public interface SysRoleOrgRepository extends JpaRepository<SysRoleOrg, Long> {
}

