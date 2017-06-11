<#-- @ftlvariable name="" type="com.example.views.PersonView" -->
<html>
    <body>
        <!-- calls getName() and sanitizes it -->
        <h1>Hello, ${name?html}!</h1>
    </body>
</html>