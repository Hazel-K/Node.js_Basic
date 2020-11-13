package com.koreait.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	@Autowired
	TodoMapper todomapper;
	
	int insTodo(TodoVO param) {
		return todomapper.insTodo(param);
	}
	
	public List<TodoVO> selTodoList() {
		return todomapper.selTodoList();
	}

	public int delTodo(TodoVO param) {
		return todomapper.delTodo(param);
	}
}
