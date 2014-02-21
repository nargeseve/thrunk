<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html dir="rtl">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <tiles:insertAttribute name="head" />
    </head>
    <body>
        <div class="main-wrapper">
            <tiles:insertAttribute name="menu" />
            <tiles:insertAttribute name="right" />
            <tiles:insertAttribute name="main" />
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>