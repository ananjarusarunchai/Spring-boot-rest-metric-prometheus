package com.company.rest_metric.rest_metric;

import io.prometheus.client.exporter.MetricsServlet;
import io.prometheus.client.hotspot.DefaultExports;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RestMetricApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMetricApplication.class, args);
	}

}
