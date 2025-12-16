<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.sist.user.member.WebMemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
String id = request.getParameter("id");

WebMemberService wms = WebMemberService.getInstance();
boolean flag = wms.searchId(id);

JSONObject jsonObj = new JSONObject();
jsonObj.put("idResult", flag);
out.print(jsonObj.toJSONString());

%>