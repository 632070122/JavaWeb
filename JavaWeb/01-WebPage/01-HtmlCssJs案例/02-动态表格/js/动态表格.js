/*获取按钮并添加单击事件*/
document.getElementById("btn-add").onclick = function () {
    /*获取文本框输入输入的内容*/
    var id = document.getElementById("id");
    var valueId = id.value;
    var name = document.getElementById("name");
    var valueName = name.value;
    var gender = document.getElementById("gender");
    var valueGender = gender.value;

   /*获取table*/
    var table = document.getElementsByTagName("table")[0];

    /*追加一行*/
    table.innerHTML += "<tr>\n" +
        "            <td>"+valueId+"</td>\n" +
        "            <td>"+valueName+"</td>\n" +
        "            <td>"+valueGender+"</td>\n" +
        "            <td><a href=\"javascript:void(0);\" onclick=\"delTr(this)\">删除</a></td>\n" +
        "            </tr>"
}

/*删除*/
function delTr(obj) {
    var table = obj.parentNode.parentNode.parentNode;
    var tr = obj.parentNode.parentNode;
    table.removeChild(tr)
}