package cn.yt4j.feishu;

import cn.yt4j.sa.annotaion.EnableYt4jSaToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 飞书服务
 */
@EnableDiscoveryClient
@EnableYt4jSaToken
@SpringBootApplication
public class FeiShuApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeiShuApplication.class, args);
	}

}