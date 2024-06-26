package cn.yt4j.auth.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.yt4j.auth.service.AuthService;
import cn.yt4j.core.domain.Result;
import cn.yt4j.log.annotation.SysLog;
import cn.yt4j.sys.api.entity.dto.LoginDTO;
import cn.yt4j.sys.api.entity.vo.LoginVO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 鉴权
 *
 * @author gyv12345@163.com
 */
@Tag(name = "鉴权")
@RestController
@RequiredArgsConstructor
public class AuthController {

	private final AuthService authService;

	/**
	 * 登录
	 * @param dto 登录用户
	 * @return token
	 */
	@SysLog("登录")
	@PostMapping("login")
	public Result<LoginVO> login(@RequestBody @Validated LoginDTO dto) {
		return Result.ok(authService.login(dto));
	}

	/**
	 * 退出登录
	 * @return 成功
	 */
	@SysLog("退出登录")
	@GetMapping("logout")
	public Result<Void> logout() {
		StpUtil.logout();
		return Result.ok();
	}

}
