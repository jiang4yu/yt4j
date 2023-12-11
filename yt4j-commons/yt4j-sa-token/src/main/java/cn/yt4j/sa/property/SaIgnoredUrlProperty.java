
package cn.yt4j.sa.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gyv12345@163.com
 */
@Primary
@RefreshScope
@Component
@Data
@ConfigurationProperties(prefix = "yt4j.sa")
public class SaIgnoredUrlProperty {

	/**
	 * exclude url
	 */
	private List<String> ignoredUrl = new ArrayList<>();

}
