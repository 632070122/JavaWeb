$(function () {
    $("ul img").click(function () {
        $(".word").append($(this).clone()).click(function () {
            $("p img").click(function () {
                $(this).remove()
            })
        })
    })
})