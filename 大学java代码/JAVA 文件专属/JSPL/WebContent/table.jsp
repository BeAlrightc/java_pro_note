<%
  String color = request.getParameter("color");
  String title = request.getParameter("title");
  String content = request.getParameter("content");
%>
<table border = "1" width="50%">
  <tr bgcolor = "<%=color %>">
    <td><%=title %></td>
  </tr>
  <tr>
    <td><%=title %></td>
    </tr>  
</table>