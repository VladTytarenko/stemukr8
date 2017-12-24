<#assign title = "Groups">
<#assign path_prefix = "../../">

<#include "common/header.ftl">
<div class="container">
    <#list group_list as group>
    <tr>
        <td>${group.id}</td>
    </tr>
    <tr>
        <td>${group.groupName}</td>
    </tr>
        <tr>
            <td><a href="groups/${group.id}">View students</a></td>
        </tr>
</#list>
</div>

<#include "common/footer.ftl">