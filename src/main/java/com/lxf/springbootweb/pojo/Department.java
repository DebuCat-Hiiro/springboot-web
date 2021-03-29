package com.lxf.springbootweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hanamaru
 * 部门表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer departId;
    private String departName;

}
