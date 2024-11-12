package com.entity.vo;

import com.entity.WupinYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 申请交换
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wupin_yuyue")
public class WupinYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物品
     */

    @TableField(value = "wupin_id")
    private Integer wupinId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 交换物品详情
     */

    @TableField(value = "wupin_yuyue_text")
    private String wupinYuyueText;


    /**
     * 交换状态
     */

    @TableField(value = "wupin_yuyue_yesno_types")
    private Integer wupinYuyueYesnoTypes;


    /**
     * 回复
     */

    @TableField(value = "wupin_yuyue_yesno_text")
    private String wupinYuyueYesnoText;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品
	 */
    public Integer getWupinId() {
        return wupinId;
    }


    /**
	 * 获取：物品
	 */

    public void setWupinId(Integer wupinId) {
        this.wupinId = wupinId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：交换物品详情
	 */
    public String getWupinYuyueText() {
        return wupinYuyueText;
    }


    /**
	 * 获取：交换物品详情
	 */

    public void setWupinYuyueText(String wupinYuyueText) {
        this.wupinYuyueText = wupinYuyueText;
    }
    /**
	 * 设置：交换状态
	 */
    public Integer getWupinYuyueYesnoTypes() {
        return wupinYuyueYesnoTypes;
    }


    /**
	 * 获取：交换状态
	 */

    public void setWupinYuyueYesnoTypes(Integer wupinYuyueYesnoTypes) {
        this.wupinYuyueYesnoTypes = wupinYuyueYesnoTypes;
    }
    /**
	 * 设置：回复
	 */
    public String getWupinYuyueYesnoText() {
        return wupinYuyueYesnoText;
    }


    /**
	 * 获取：回复
	 */

    public void setWupinYuyueYesnoText(String wupinYuyueYesnoText) {
        this.wupinYuyueYesnoText = wupinYuyueYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
