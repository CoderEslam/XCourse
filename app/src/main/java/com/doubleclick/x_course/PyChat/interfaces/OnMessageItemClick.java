package com.doubleclick.x_course.PyChat.interfaces;


import com.doubleclick.x_course.PyChat.models.Message;

public interface OnMessageItemClick {

    void OnMessageClick(Message message, int position);

    void OnMessageLongClick(Message message, int position);
}
