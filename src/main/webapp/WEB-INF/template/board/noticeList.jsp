<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="net.kanozo.domain.Criteria"%>

<%
	Criteria criteria;
%>
<body>
    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <h2>공지사항</h2>
                <div class="row">
                    <div class="col-12 text-right">
                        <form class="form form-inline justify-content-end" id="searchForm">
                            <input type="text" class="form-control mb-2 mr-sm-2" id="keyword"
                                placeholder="검색어를 입력하세요" />
                            <button type="button" id="btnSearch" class="btn btn-primary mb-2">검색</button>
                        </form>
                    </div>
                </div>
                <table class="table table-striped">
                    <tr>
                        <th>글번호</th>
                        <th width="50%">글제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                    </tr>

                    <c:forEach var="board" items="${list}">
                        <tr>
                            <td>${board.id}</td>
                            <td><a href="/notice/noticeView/${board.id}${criteria.getQuery(criteria.page)}">${board.title}</a>
                            </td>
                            <td>${board.writer}</td>
                            <td>${board.writeDate}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-10 offset-1 text-right">
                <a href="/notice/write" class="btn btn-primary">글작성</a>
            </div>
        </div>



        <nav>
            <ul class="pagination justify-content-center">
                <c:if test="${criteria.prev}">
                    <li class="page-item">
                        <a href="/notice/noticeList${criteria.getQuery(criteria.start - 1)}" class="page-link"
                            aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                </c:if>

                <c:forEach var="i" begin="${criteria.start}" end="${criteria.end}" step="1">
                    <li class="page-item">
                        <a href="/notice/noticeList${criteria.getQuery(i)}" class="page-link">${i}</a>
                    </li>
                </c:forEach>

                <c:if test="${criteria.next}">
                    <li class="page-item">
                        <a href="/notice/noticeList${criteria.getQuery(criteria.end + 1)}" class="page-link"
                            aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </c:if>
            </ul>
        </nav>

    </div>
    <script>
        $(function () {
            $("#btnSearch").on("click", function (e) {
                let text = $("#keyword").val();
                location.href = '/board/list3?keyword=' + text;
            });
            $("#searchForm").on("submit", function (e) {
                $("#btnSearch").click();
                return false;
            });
        });
    </script>
</body>
