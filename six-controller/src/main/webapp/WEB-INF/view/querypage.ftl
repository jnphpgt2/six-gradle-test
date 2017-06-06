<#-- ��ҳ��Pager��������URL������Map�����ҳ����ʾ���� -->
<#macro pager pager baseUrl parameterMap = {} maxShowPageCount = 4>
    <#local pageNumber = pager.pageNumber />
    <#local pageSize = pager.pageSize />
    <#local pageCount = pager.pageCount />
    <#local parameter = "" />

    <#local parameter = parameter + "&pageSize=" + pageSize />

    <#list parameterMap?keys as key>
        <#if parameterMap[key] != null && parameterMap[key] != "">
            <#local parameter = parameter + "&" + key + "=" + parameterMap[key] />
        </#if>
    </#list>
    <#if baseUrl?contains("?")>
        <#local baseUrl = baseUrl + "&" />
    <#else>
        <#local baseUrl = baseUrl + "?" />
    </#if>
    <#local firstPageUrl = baseUrl + "pageNumber=1" + parameter />
    <#local lastPageUrl = baseUrl + "pageNumber=" + pageCount + parameter />
    <#local prePageUrl = baseUrl + "pageNumber=" + (pageNumber - 1) + parameter />
    <#local nextPageUrl = baseUrl + "pageNumber=" + (pageNumber + 1) + parameter />

    <#if maxShowPageCount <= 0>
        <#local maxShowPageCount = 4>
    </#if>

    <#local segment = ((pageNumber - 1) / maxShowPageCount)?int + 1 />
    <#local startPageNumber = (segment - 1) * maxShowPageCount + 1 />
    <#local endPageNumber = segment * maxShowPageCount />
    <#if (startPageNumber < 1)>
        <#local startPageNumber = 1 />
    </#if>
    <#if (endPageNumber > pageCount)>
        <#local endPageNumber = pageCount />
    </#if>

    <#if (pageCount > 1)>
    <div class="pager_area">
        <ul class="pager">
            <li class="pageInfo">
                �� ${pageCount} ҳ
            </li>
        <#-- ��ҳ -->
            <#if (pageNumber > 1)>
                <li class="firstPage">
                    <a href="${firstPageUrl}">��ҳ</a>
                </li>
            <#else>
                <li class="firstPage">
                    <span>��ҳ</span>
                </li>
            </#if>

        <#-- ��һҳ -->
            <#if (pageNumber > 1)>
                <li class="prePage">
                    <a href="${prePageUrl}">��һҳ</a>
                </li>
            <#else>
                <li class="prePage">
                    <span>��һҳ</span>
                </li>
            </#if>

            <#if (startPageNumber > 1)>
                <li>
                    <a href="${baseUrl + "pageNumber=" + (pageNumber - 2) + parameter}">...</a>
                </li>
            </#if>

            <#list startPageNumber .. endPageNumber as index>
                <#if pageNumber != index>
                    <li>
                        <a href="${baseUrl + "pageNumber=" + index + parameter}">${index}</a>
                    </li>
                <#else>
                    <li class="currentPage">
                        <span>${index}</span>
                    </li>
                </#if>
            </#list>

            <#if (endPageNumber < pageCount)>
                <li>
                    <a href="${baseUrl + "pageNumber=" + (pageNumber + 2) + parameter}">...</a>
                </li>
            </#if>

        <#-- ��һҳ -->
            <#if (pageNumber < pageCount)>
                <li class="nextPage">
                    <a href="${nextPageUrl}">��һҳ</a>
                </li>
            <#else>
                <li class="nextPage">
                    <span>��һҳ</span>
                </li>
            </#if>

        <#-- ĩҳ -->
            <#if (pageNumber < pageCount)>
                <li class="lastPage">
                    <a href="${lastPageUrl}">ĩҳ</a>
                </li>
            <#else>
                <li class="lastPage">
                    <span>ĩҳ</span>
                </li>
            </#if>
        </ul>
    </div>
    </#if>

</#macro>