package com.vinay.springBoot.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class i18nController {

	@Autowired
	private MessageSource messageSource;

	// URL : http://localhost:8080/hello-world-i18n
	@GetMapping(path = "/hello-world-i18n")
	public String helloWorldInternationalized() {
		System.out.println("Current Locale :: " + LocaleContextHolder.getLocale());
		return messageSource.getMessage("message.goodMorning", null, LocaleContextHolder.getLocale());
	}

	/**
	 * In SOAP-UI or Postman, send a request with header key/value as
	 * Accept-Language=us/fr/nl
	 */

}
