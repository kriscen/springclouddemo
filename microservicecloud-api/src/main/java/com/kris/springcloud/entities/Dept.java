package com.kris.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor//全参构造方法
@NoArgsConstructor//无参构造方法
@Data//使用lombok
@Accessors(chain = true)//链式编程
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    private String dbSource;

}
