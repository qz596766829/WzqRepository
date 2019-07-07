package com.globmate.shop.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author virus_plus
 * @since 2019-06-03
 */
@TableName("hxx_shop_order_pay_log")
public class HxxShopOrderPayLog extends Model<HxxShopOrderPayLog> {

    private static final long serialVersionUID = 1L;

    private String id;
    /**
     * 订单id
     */
    @TableField("order_id")
    private String orderId;
    /**
     * 支付方式（1：银联）
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 支付状态（0：支付失败，1:支付中,2:支付成功）
     */
    @TableField("pay_status")
    private Integer payStatus;
    /**
     * 支付失败原因
     */
    private String reason;
    /**
     * 支付流水号
     */
    @TableField("pay_code")
    private String payCode;
    /**
     * 支付时间
     */
    @TableField("create_time")
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HxxShopOrderPayLog{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", payType=" + payType +
        ", payStatus=" + payStatus +
        ", reason=" + reason +
        ", payCode=" + payCode +
        ", createTime=" + createTime +
        "}";
    }
}
