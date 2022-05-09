package com.spring.transaction.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import com.spring.transaction.service.ScheduleInfoService;

@Controller
public class HomeController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ScheduleInfoService scheduleInfoService;

	@RequestMapping(value="/")
	public String setting(Locale locale, Model model, HttpServletRequest request) {
		model.addAttribute("masterBoardDateList", this.scheduleInfoService.getTransactionMasterDateList());
		model.addAttribute("boardDateList", this.scheduleInfoService.getTransactionDateList());
		return "home";
	}
}
