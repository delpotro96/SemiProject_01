$(document).ready(function () {

    const id = $.cookie("id");
    if (id) {
        $("#loginSpan").html(id + " 님 안녕하세요 <button id='logoutBtn'>logout</button>")
    }
    $("#loginBtn").click(function () {
        const id = $("#id").val();
        const pw = $("#pw").val();
        $.post('../../login', {id, pw}, function (data) {
            data = JSON.parse(data);
            if (data.id) {
                $("#loginSpan").html(data.id + " 님 안녕하세요 <button id='logoutBtn'>logout</button>");
                $.cookie("id", data.id);
            } else {
                alert("입력한 정보를 확인하세요")
            }
        });
    })
})
$(document).on("click", "#logoutBtn", function () {
    $.post('../../logout', {}, function (data) {
        data = JSON.parse(data);
        if (data.msg == "ok") {
            $.removeCookie("id");
            location.reload();
        } else {
            alert(data.msg);
        }
    });
})