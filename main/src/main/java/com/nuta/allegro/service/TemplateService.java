package com.nuta.allegro.service;

import com.nuta.allegro.FormParams;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

@Service
public class TemplateService {

	@Resource(name="properties")
	private Properties properties;

	public String initTemplate(List<String> imagesLinks, FormParams formParams) {
		Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		Velocity.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		Velocity.init();

		VelocityContext context = new VelocityContext();

		context.put("StringUtils", StringUtils.class);
		context.put("imagesLinks", imagesLinks);
		context.put("content", formParams.getContent());
		String schema = formParams.getSchema();
		if (schema != null) {
			context.put("schema", properties.getProperty(schema));
		}
		context.put("sizeA", formParams.getSizeA());
		context.put("sizeB", formParams.getSizeB());
		context.put("sizeC", formParams.getSizeC());
		context.put("sizeD", formParams.getSizeD());
		context.put("sizeE", formParams.getSizeE());
		context.put("sizeF", formParams.getSizeF());

		Template template = null;
		try {
			template = Velocity.getTemplate("../pages/template/template.vm", "UTF-8");
		} catch (Exception ignored) {
		}

		StringWriter sw = new StringWriter();

		if (template != null) {
			template.merge(context, sw);
		}

		return sw.toString();
	}

}
