package com.example.poi.vo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class EnrollUpVo {
    @Excel(name = "车身号码")
    private String no;
    @Excel(name = "真实姓名")
    private String realName;
    @Excel(name = "昵称")
    private String nick;
    @Excel(name = "车架号")
    private String number;
    @Excel(name = "手机")
    private String phone;
    @Excel(name = "车队/厂商")
    private String team;
    @Excel(name = "身份证号")
    private String cardNo;
    @Excel(name = "微信号")
    private String wxNumber;
    @Excel(name = "品牌")
    private String carBrand;
    @Excel(name = "车型")
    private String carModel;
    @Excel(name = "进气模式")
    private String intakeMode;
    @Excel(name = "驱动形式")
    private String driveMode;
    @Excel(name = "马力")
    private String hp;
    @Excel(name = "改装清单")
    private String modifyInfo;
    @Excel(name = "分组")
    private String groups;
}
