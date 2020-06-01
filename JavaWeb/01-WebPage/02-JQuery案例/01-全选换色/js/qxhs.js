$(function () {
    $("tr:gt(1):odd").css("backgroundColor","pink")
    $("tr:gt(1):even").css("backgroundColor","red")

})
function selectAll(obj) {
    $(".itemSelect").prop("checked",obj.checked)
}