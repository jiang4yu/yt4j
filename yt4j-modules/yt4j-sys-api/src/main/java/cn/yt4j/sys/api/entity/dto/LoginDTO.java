/*
 *    Copyright (c) [2020] [yang1989]
 *    [yt4j] is licensed under Mulan PSL v2.
 *    You can use this software according to the terms and conditions of the Mulan PSL v2.
 *    You may obtain a copy of Mulan PSL v2 at:
 *             http://license.coscl.org.cn/MulanPSL2
 *    THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 *    See the Mulan PSL v2 for more details.
 */

package cn.yt4j.sys.api.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author gyv12345@163.com
 */
@Data
@ToString
@ApiModel("登录实体")
public class LoginDTO implements Serializable {

	private static final long serialVersionUID = 7380450222422017042L;

	@ApiModelProperty("用户名")
	@NotBlank(message = "登录用户名不能为空")
	private String username;

	@ApiModelProperty("密码")
	@NotBlank(message = "登录密码不能为空")
	private String password;

}
