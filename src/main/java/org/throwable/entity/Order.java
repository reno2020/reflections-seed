package org.throwable.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/8/13 17:24
 */
@Data
public class Order {

	@Id
	private Long id;
	@Column(name = "order_id")
	private String orderId;
	@Column(name = "user_id")
	private Long userId;
}
