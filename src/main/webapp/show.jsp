<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.Cust" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2021
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AAA</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Customers</h2>
    <table class="table">
        <thead>
        <tr>
            <th>name</th>
            <th>DoB</th>
            <th>address</th>
            <th>Pic</th>
        </tr>
        <img src="images/images.png">
        </thead>
        <tbody>
        <%
            ArrayList<Cust> custs = (ArrayList<Cust>) request.getAttribute("Cust");
            String str = "";
            for (Cust c : custs) {
                str += "<tr><td>" + c.getTen() + "</td><td>" + c.getNgaysinh() + "</td><td>"
                        + c.getDiaChi() + "</td><td><img src=\"" + c.getPic() +"\"></td></tr>";
            }
            out.println(str);
        %>
        </tbody>
    </table>
</div>
</body>
</html>
