<%@ page import="java.util.List" %>
<%@ page import="app.model.entities.ScientificPublication" %>
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

<div>
    <form action="sortingByAge" method="sorting" >
        <button type="submit">Sort by Age</button>


    </form>

</div>
</div>
<div>
    <div class="w3-container w3-center">
        <div class="w3-bar w3-padding-large w3-padding-24">
            <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/'">Back to main</button>
        </div>
    </div>
</div>
</body>
</html>