/*
 *    Copyright (c) [2020] [yang1989]
 *    [yt4j] is licensed under Mulan PSL v2.
 *    You can use this software according to the terms and conditions of the Mulan PSL v2.
 *    You may obtain a copy of Mulan PSL v2 at:
 *             http://license.coscl.org.cn/MulanPSL2
 *    THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 *    See the Mulan PSL v2 for more details.
 */

package cn.yt4j.flow.work;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author gyv12345@163.com
 */
@Data
@ToString
public class LineEntity implements Serializable {

	private static final long serialVersionUID = 5907732080447102514L;
	/**
	 * 连线标题
	 */
	private String label;

	/**
	 * 上级节点
	 */
	private String from;

	/**
	 * 到哪个节点
	 */
	private String to;

	/**
	 * 条件
	 */
	private String condition;

}
