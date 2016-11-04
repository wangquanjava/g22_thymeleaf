package com.git.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.mapper.DemoMapper;
import com.git.mapper.DemoSqlMapper;
import com.git.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private DemoMapper demoMapper;
	private DemoSqlMapper demoSqlMapper;
}
