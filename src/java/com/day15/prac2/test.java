package com.day15.prac2;

import org.junit.Test;

interface IEmailContent {
    void setContent(String content);
}
class IEmailContentImpl implements IEmailContent{
    @Override
    public void setContent(String content) {
    }
}
interface IEmailHeader{
    void setReceiver(String receiver);
    void setSender(String sender);
}
class IEmailHeaderImpl implements IEmailHeader{
    @Override
    public void setReceiver(String receiver) {
    }
    @Override
    public void setSender(String sender) {
    }
}
class Email {
    IEmailHeader iEmailHeader = new IEmailHeaderImpl();
    IEmailContent iEmailContent = new IEmailContentImpl();
    public void setSender() {// set sender;
        iEmailHeader.setSender("");
        }
    public void setReceiver() {// set receiver;
        iEmailHeader.setReceiver("");
        }
    public void setContent() {// set content;
        iEmailContent.setContent("");
        }
}
public class test{
    @Test
    public void demo(){

    }
}