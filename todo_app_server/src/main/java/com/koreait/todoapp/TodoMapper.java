package com.koreait.todoapp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
	List<TodoVO> selTodoList();
	int insTodo(TodoVO param);
	int delTodo(TodoVO param);
}
