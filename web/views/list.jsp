<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Publications</title>
</head>

<body>
<div>
    <h1>List of Publications!</h1>
</div>

<div>
    <div>
        <div>
            <h2>Publications</h2>
        </div>
        <%
            List<String> names = (List<String>) request.getAttribute("userNames");

            if (names != null && !names.isEmpty()) {
                out.println("<ui>");
                for (String s : names) {
                    out.println("<li>" + s + "</li>");
                }
                out.println("</ui>");
            } else out.println("<p>There are no publications yet!</p>");
        %>
    </div>
</div>

</div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>