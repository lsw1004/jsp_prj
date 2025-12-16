<%@page import="day1127.DataService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" data-bs-theme="auto">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">

<title>JSP템플릿</title>
<link rel="shortcut icon" href="http://192.168.10.96/jsp_prj/common/images/favicon.ico">

<script src="http://192.168.10.96/jsp_prj/common/js/color-modes.js"></script>
<!-- bootstrap CDN 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

<meta name="theme-color" content="#712cf9">
<link href="http://192.168.10.96/jsp_prj/common/css/carousel.css" rel="stylesheet">
<jsp:include page="../fragments/bootstrap_css.jsp"/>
<style type="text/css">
#wrap{  margin: 0px auto; width: 1200px; height: 1000px; }   
#header{ height: 150px;    }   
#container{ height: 700px;    }   
#footer{ height: 150px;}   
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script type="text/javascript">
$(function(){
   
});//ready

</script>


</head>
<body>
   <header data-bs-theme="dark">
      <jsp:include page="../fragments/header.jsp"/>
   </header>
   <main>
      <!-- Marketing messaging and featurettes
  ================================================== -->
      <!-- Wrap the rest of the page in another container to center all the content. -->
      <div class="container marketing">
         <!-- Three columns of text below the carousel -->
         <!-- /.row -->
         <!-- START THE FEATURETTES -->
         <hr class="featurette-divider">
         <div class="row featurette">
            <div class="col-md-7">
            <!-- 기본 생성자를 사용하여 객체가 생성된다. -->
            <jsp:useBean id="dDTO" class="day1127.DataDTO"  />
            <%=dDTO %>
            <!-- setter method 호출 값 설정 -->
            <!-- setName 값 설정 -->
            <jsp:setProperty property="name" name="dDTO" value="민병조"/>
            <!-- setage 값 설정 -->
            <jsp:setProperty property="myAge" name="dDTO" value="26"/>
            
            <!-- getter method 호출 -->
            이름 : <jsp:getProperty property="name" name="dDTO"/>
            나이 : <jsp:getProperty property="myAge" name="dDTO"/>
            </div>
            <%
            DataService ds = new DataService();
            
            
            String msg = ds.msg(dDTO);
            %>
         </div>
         <hr class="featurette-divider">
         <!-- /END THE FEATURETTES -->
      </div>
      <!-- /.container -->
      <!-- FOOTER -->
      <footer class="container">
         <jsp:include page="../fragments/footer.jsp"/>
      </footer>
   </main>
   
</body>
</html>