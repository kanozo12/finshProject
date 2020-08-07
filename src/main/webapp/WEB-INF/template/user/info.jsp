<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
    <div class="container">
        <div class="card text-center mt-3">
            <h2 class="card-header">- 프로필 조회 ${sessionScope.user.name} -</h2>
            <div class="card-body d-flex">
                <!--   이미지 박스 -->
                <div style="width: 128px; height: 128px;">
                    <img src="/user/profile/" + ${sessionScope.user.img} alt="userProfile"
                        style="width: 128px; height: 128px;" />
                </div>

                <div>
                    <h4 class="card-title">${sessionScope.user.name}</h4>
                    <p class="card-text">
                        <span class="badge badge-primary">${sessionScope.user.name} ( ${sessionScope.user.userid}
                            )</span>
                        <span class="badge badge-secondary">LV.[ ${sessionScope.user.u_level} ]</span> <span
                            class="badge badge-primary">${sessionScope.user.cnt}</span>
                    </p>

                    <div class="progress">
                        <div class="progress-bar" role="progressbar" style="width: ${sessionScope.user.u_exp}%;"
                            aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>