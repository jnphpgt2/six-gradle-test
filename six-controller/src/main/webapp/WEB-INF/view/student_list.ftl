<#setting classic_compatible=true>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Book List</title>
    <style type="text/css">
        <!--
        .STYLE1 {
            font-family: Arial, Helvetica, sans-serif;
            font-weight: bold;
            font-size: 36px;
            color: #FF0000;
        }
        .STYLE13 {font-size: 24}
        .STYLE15 {font-family: Arial, Helvetica, sans-serif; font-size: 24px; }
        -->
    </style>
</head>

<body>
<table width="1500" height="600" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td width="500" height="200">&nbsp;</td>
        <td width="500" height="200" align="center" valign="middle"><div align="center"><span class="STYLE1">Book List </span></div></td>
        <td width="500" height="200">&nbsp;</td>
    </tr>
    <tr>
        <td width="500" height="200">&nbsp;</td>
        <td width="500" height="200"><table width="500" height="200" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td width="160" height="65" align="center" valign="middle" colspan="2">
                <span class="STYLE15">搜索<form action="${reuqest.getContextPath}/getList_1.do" method="post"><input type="text" value="${tname}" name="tname"/><input type="submit" value="点击"/></form>
                </span>
                </td>
            </tr>
            <tr>
                <td width="160" height="65" align="center" valign="middle"><span class="STYLE15">TID</span></td>
                <td width="160" height="65" align="center" valign="middle"><span class="STYLE15">Tname</span></td>
            </tr>
        <#list list as ll>
            <tr>
                <td width="160" height="65" align="center" valign="middle"><span class="STYLE15">${ll.tid}</span></td>
                <td width="160" height="65" align="center" valign="middle"><span class="STYLE15">${ll.tname}</span></td>
            </tr>
        </#list>
            <tr>
                <td width="160" height="65" align="center" valign="middle" colspan="2"><span class="STYLE15">${page}</span></td>
            </tr>
        </table></td>
        <td width="500" height="200">&nbsp;</td>
    </tr>
    <tr>
        <td width="500" height="200">&nbsp;</td>
        <td width="500" height="200">&nbsp;</td>
        <td width="500" height="200">&nbsp;</td>
    </tr>
</table>
</body>
</html>