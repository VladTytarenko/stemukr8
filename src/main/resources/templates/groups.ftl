<#assign title = "Groups">
<#assign path_prefix = "../../">

<#include "common/header.ftl">
<div class="container">
    <#list group_list as group>
    <tr>
        <td>${group.id}</td>
        <td>${group.groupName}</td>
    </tr>
</#list>
</div>

<#include "common/footer.ftl">