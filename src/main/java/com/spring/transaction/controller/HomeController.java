package com.spring.transaction.controller;

import java.util.Locale;

import com.spring.transaction.service.ScheduleInfoAopService;
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
	@Autowired
	private ScheduleInfoAopService scheduleAopInfoService;

	@RequestMapping(value="/")
	public String setting(Locale locale, Model model, HttpServletRequest request) {
		//Transactional CQRS
		model.addAttribute("masterBoardDateList", this.scheduleInfoService.getTransactionMasterDateList());
		model.addAttribute("boardDateList", this.scheduleInfoService.getTransactionDateList());

		//AOP CQRS
		model.addAttribute("aopMasterBoardDateList", this.scheduleAopInfoService.setTransactionDate());
		model.addAttribute("aopBoardDateList", this.scheduleAopInfoService.getTransactionDateList());
		return "home";
	}
}
