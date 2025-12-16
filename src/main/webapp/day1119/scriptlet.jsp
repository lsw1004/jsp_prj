<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function result(num,num2,num3) {
	alert(num + " x " + num2 + " = " + (num*num2) + " / " + num3);
}
</script>
<body>
	<%
	// scriptlet => JSP가 Java로 변경될 때 _jspService()안에 코드가 생성된다.
	String name = "민병조";
	%>
	안녕하세요?
	<span><%=name%></span>님
	<br>
	<ul>
		<%
		for (int i = 0; i < 10; i++) {
		%>
		<li><%=i%></li>
		<%
		}
		%>
	</ul>

	<!-- 테이블에 구구단 2단을 출력 -->
	<table style="border: solid 1px #333">
		<tr>
			<%
			for (int i = 1; i < 10; i++) {
			%>
			<td style="border: solid 1px #333" onclick="result(2,<%=i %>,2*<%=i %>)">2 x <%=i %></td>
			<%
			}
			%>
		</tr>
	</table>
<div>
<% for(int i=1;i<7;i++){ %>
<h<%=i %>>안녕하세요</h<%=i %>>
<% }// end for %>
</div>

<div>
구구단 모든 단을 테이블로 출력
<table>
<thead>
<tr>
<% for(int i=2;i<10;i++){ %>
<th><%=i %>단</th>
<% }// end for %>
</tr>
</thead>
<tbody>
<% for(int i=1;i<10;i++){ %>
<tr>
<% for(int j=2;j<10;j++){ %>
<td><%=j %>x<%=i %>=<%=i*j %></td>
<% }// end for %>
</tr>
<% }// end for %>
</tbody>

</table>
</div>

</body>
</html>