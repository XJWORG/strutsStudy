<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'input.jsp' starting page</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

  </head>
  
<body>
    <table align="center" width="40%" style="color:red">
        <tr>
            <td>
                <s:actionerror/>
            </td>
        </tr>
    </table>
    

	<s:form action="register" method="post" theme="simple">
		<s:textfield name="username" label="username"></s:textfield><br><br>
		<s:password name="password" label="password"></s:password>
		<s:password name="repassword" label="re-password"></s:password>
		<s:textfield name="age" label="age" ></s:textfield>
		<s:textfield name="birthday" label="birthday"></s:textfield>
		<s:submit name="submit"></s:submit>
		<s:reset name="reset"></s:reset>
	</s:form>


</body>
</html>