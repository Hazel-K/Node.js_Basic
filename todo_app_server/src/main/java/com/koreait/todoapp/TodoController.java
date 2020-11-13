package com.koreait.todoapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TodoController {
	
	@Autowired
	TodoService todoservice;
	
	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public int insTodo(@RequestBody TodoVO param) {
		return todoservice.insTodo(param);
	}

	@RequestMapping(value = "/selTodoList", method = RequestMethod.GET)
	public List<TodoVO> selTodoList() {
		return todoservice.selTodoList();
	}
	
	@RequestMapping(value = "/todo", method = RequestMethod.DELETE)
	public int todo(TodoVO param) {
		return todoservice.delTodo(param);
	}
	
}
